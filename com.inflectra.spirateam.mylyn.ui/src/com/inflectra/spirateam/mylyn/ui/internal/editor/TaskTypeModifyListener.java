package com.inflectra.spirateam.mylyn.ui.internal.editor;

import java.util.Set;

import org.eclipse.mylyn.tasks.core.TaskRepository;
import org.eclipse.mylyn.tasks.core.data.TaskAttribute;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;

import com.inflectra.spirateam.mylyn.core.internal.ArtifactAttribute;
import com.inflectra.spirateam.mylyn.core.internal.SpiraTeamRepositoryConnector;
import com.inflectra.spirateam.mylyn.core.internal.SpiraTeamTaskDataHandler;

/**
 * 
 * @author peter.geertsema
 *
 */
public class TaskTypeModifyListener implements ModifyListener {
	private TaskTypeAttributeEditor attributeEditor;
	
	public TaskTypeModifyListener(TaskTypeAttributeEditor attributeEditor)
	{
		this.attributeEditor = attributeEditor;
	}
	
	public TaskTypeAttributeEditor getAttributeEditor()
	{
		return this.attributeEditor;
	}
	
	/**
	 * Called when the task type attribute changes
	 */
	@Override
	public void modifyText(ModifyEvent arg0)
	{
		try
		{
			//Get the new value of the data
			CCombo combo = (CCombo) arg0.getSource();
			String newTaskTypeName = combo.getText();
						
			//Tell the data-handler that we've changed task type
			//and that we need to update the workflow and fields accordingly
			SpiraTeamTaskEditorPage editorPage = attributeEditor.getEditorPage();
			if (editorPage != null)
			{
				SpiraTeamRepositoryConnector connector = (SpiraTeamRepositoryConnector) editorPage.getConnector();
				TaskRepository repository = editorPage.getTaskRepository();
				if (connector != null)
				{
					SpiraTeamTaskDataHandler dataHandler = connector.getTaskDataHandler();
					if (dataHandler != null)
					{
						Set<TaskAttribute> changedAttributes = dataHandler.changeTaskType(repository, attributeEditor.getTaskAttribute().getTaskData(), newTaskTypeName);
	
						//Now we need to make the editor know that the attributes have changed
						for (TaskAttribute changedAttribute : changedAttributes)
						{
							//Don't send a changed event for Type or we'll get into an infinite loop
							if (!changedAttribute.getId().equals(ArtifactAttribute.TASK_TYPE_ID.getArtifactKey()))
							{
								editorPage.getModel().attributeChanged(changedAttribute);
							}
						}
									
						//Finally force a refresh so that the workflow field state changes take effect
						editorPage.refreshAfterTypeChange();
					}
				}
			}
		}
		catch (NumberFormatException ex)
		{
			//Ignore and leave fields alone
		}
	}
}
