package com.inflectra.spirateam.mylyn.ui.internal.editor;

import java.util.Map;

import org.eclipse.core.runtime.Assert;
import org.eclipse.mylyn.internal.tasks.ui.editors.EditorUtil;
import org.eclipse.mylyn.tasks.core.data.TaskAttribute;
import org.eclipse.mylyn.tasks.core.data.TaskDataModel;
import org.eclipse.mylyn.tasks.core.data.TaskDataModelEvent;
import org.eclipse.mylyn.tasks.core.data.TaskDataModelListener;
import org.eclipse.mylyn.tasks.ui.editors.AbstractAttributeEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class IncidentTypeAttributeEditor extends AbstractAttributeEditor
{
	private CCombo combo;
	private boolean ignoreNotification;
	private Text text;
	private String[] values;
	private TaskDataModel taskDataModel;
	private TaskAttribute taskAttribute;
	private SpiraTeamTaskEditorPage editorPage;
	IncidentTypeModifyListener modifyListener = null;
	
	private final TaskDataModelListener modelListener = new TaskDataModelListener()
	{
		@Override
		public void attributeChanged(TaskDataModelEvent event)
		{
			if (getTaskAttribute().equals(event.getTaskAttribute()))
			{
				refresh();
			}
		}
	};

	public IncidentTypeAttributeEditor(TaskDataModel taskDataModel, TaskAttribute taskAttribute, SpiraTeamTaskEditorPage editorPage)
	{
		super(taskDataModel, taskAttribute);
		this.taskDataModel = taskDataModel;
		this.taskAttribute = taskAttribute;
		this.editorPage = editorPage;
	}
	
	public SpiraTeamTaskEditorPage getEditorPage()
	{
		return this.editorPage;
	}
	
	public TaskAttribute getTaskAttribute()
	{
		return this.taskAttribute;
	}
	
	public TaskDataModel getTaskDataModel()
	{
		return this.taskDataModel;
	}


	@Override
	public void createControl(final Composite parent, FormToolkit toolkit)
	{
		if (isReadOnly())
		{
			text = new Text(parent, SWT.FLAT | SWT.READ_ONLY);
			text.setFont(EditorUtil.TEXT_FONT);
			toolkit.adapt(text, false, false);
			text.setData(FormToolkit.KEY_DRAW_BORDER, Boolean.FALSE);
			setControl(text);
		}
		else
		{
			combo = new CCombo(parent, SWT.FLAT | SWT.READ_ONLY);
			combo.setVisibleItemCount(10);
			toolkit.adapt(combo, false, false);
			combo.setFont(EditorUtil.TEXT_FONT);
			combo.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TREE_BORDER);
			combo.addSelectionListener(new SelectionAdapter()
			{
				@Override
				public void widgetSelected(SelectionEvent event)
				{
					if (!ignoreNotification)
					{
						int index = combo.getSelectionIndex();
						if (index > -1)
						{
							Assert.isNotNull(values);
							Assert.isLegal(index >= 0 && index <= values.length - 1);
							setValue(values[index]);
						}
					}
				}
			});
			EditorUtil.addScrollListener(combo);
			setControl(combo);
		}
		refresh();

		getControl().addDisposeListener(new DisposeListener()
		{
			public void widgetDisposed(DisposeEvent e)
			{
				getModel().removeModelListener(modelListener);
			}

		});
		getModel().addModelListener(modelListener);
		enableModifyListener();
	}
	
	public void enableModifyListener()
	{
		if (this.combo != null)
		{
			this.modifyListener = new IncidentTypeModifyListener(this);
			this.combo.addModifyListener(this.modifyListener);
		}
	}
	public void disableModifyListener()
	{
		if (this.modifyListener != null && this.combo != null)
		{
			combo.removeModifyListener(this.modifyListener);
		}
	}

	public String getValue()
	{
		return getAttributeMapper().getValue(getTaskAttribute());
	}

	public String getValueLabel()
	{
		return getAttributeMapper().getValueLabel(getTaskAttribute());
	}

	@Override
	public void refresh()
	{
		try
		{
			ignoreNotification = true;
			if (text != null)
			{
				String label = getValueLabel();
				if ("".equals(label)) { //$NON-NLS-1$
					// if set to the empty string the label will use 64px on GTK 
					text.setText(" "); //$NON-NLS-1$
				} else {
					text.setText(label);
				}
			}
			else if (combo != null)
			{
				combo.removeAll();
				Map<String, String> labelByValue = getAttributeMapper().getOptions(getTaskAttribute());
				if (labelByValue != null)
				{
					values = labelByValue.keySet().toArray(new String[0]);
					for (String value : values)
					{
						combo.add(labelByValue.get(value));
					}
				}
				select(getValue(), getValueLabel());
				combo.redraw();
			}
		}
		finally
		{
			ignoreNotification = false;
		}
	}

	private void select(String value, String label)
	{
		if (values != null)
		{
			for (int i = 0; i < values.length; i++)
			{
				if (values[i].equals(value))
				{
					combo.select(i);
					break;
				}
			}
		}
		else
		{
			combo.setText(label);
		}
	}

	void selectDefaultValue()
	{
		if (combo.getSelectionIndex() == -1 && values.length > 0)
		{
			combo.select(0);
			setValue(values[0]);
		}
	}

	public void setValue(String value)
	{
		String oldValue = getAttributeMapper().getValue(getTaskAttribute());
		if (!oldValue.equals(value))
		{
			getAttributeMapper().setValue(getTaskAttribute(), value);
			attributeChanged();
		}
	}
}
