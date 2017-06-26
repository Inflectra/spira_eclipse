/**
 * 
 */
package com.inflectra.spirateam.mylyn.ui.internal.editor;

import org.eclipse.mylyn.tasks.ui.ITasksUiConstants;
import org.eclipse.mylyn.tasks.ui.TasksUiImages;
import org.eclipse.mylyn.tasks.ui.TasksUiUtil;
import org.eclipse.mylyn.tasks.ui.editors.AbstractTaskEditorPageFactory;
import org.eclipse.mylyn.tasks.ui.editors.TaskEditor;
import org.eclipse.mylyn.tasks.ui.editors.TaskEditorInput;
import org.eclipse.mylyn.commons.ui.CommonImages;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.forms.editor.FormPage;

import com.inflectra.spirateam.mylyn.core.internal.SpiraTeamCorePlugin;
import com.inflectra.spirateam.mylyn.ui.internal.SpiraTeamImages;

/**
 * @author Inflectra Corporation
 *
 */
public class SpiraTeamTaskEditorFactory extends AbstractTaskEditorPageFactory
{
	@Override
	public boolean canCreatePageFor(TaskEditorInput input)
	{
		if (input.getTask().getConnectorKind().equals(SpiraTeamCorePlugin.CONNECTOR_KIND))
		{
			return true;
		}
		else if (TasksUiUtil.isOutgoingNewTask(input.getTask(), SpiraTeamCorePlugin.CONNECTOR_KIND))
		{
			return true;
		}
		return false;
	}

	@Override
	public FormPage createPage(TaskEditor parentEditor)
	{
		return new SpiraTeamTaskEditorPage(parentEditor);
	}

	@Override
	public String[] getConflictingIds(TaskEditorInput input)
	{
		return new String[] { ITasksUiConstants.ID_PAGE_PLANNING };
	}

	@Override
	public Image getPageImage()
	{
		return CommonImages.getImageWithOverlay(TasksUiImages.REPOSITORY_SMALL, SpiraTeamImages.OVERLAY_SPIRA, false, false);
	}

	@Override
	public String getPageText()
	{
		return Messages.TaskEditorFactory_PageText; //$NON-NLS-1$
	}

	@Override
	public int getPriority()
	{
		return PRIORITY_TASK;
	}

}
