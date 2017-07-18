package com.inflectra.spirateam.mylyn.core.internal.model;

import com.inflectra.spirateam.mylyn.core.internal.services.soap.RemoteWorkflowCustomProperty;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.RemoteWorkflowField;

/**
 * Represents a workflow field for a task
 * New in version 5.0
 * @author peter.geertsema
 *
 */
public class TaskWorkflowField extends ArtifactWorkflowField{
	/**
	 * Creates a field from the SOAP object
	 * @param workflowField
	 */
	public TaskWorkflowField(RemoteWorkflowField workflowField) {
		super(workflowField);
	}
	
	public TaskWorkflowField(RemoteWorkflowCustomProperty workflowCustomProperties) {
		super(workflowCustomProperties);
	}
}