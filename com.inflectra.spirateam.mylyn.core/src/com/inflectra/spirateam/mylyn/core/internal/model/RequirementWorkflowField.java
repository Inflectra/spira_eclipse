package com.inflectra.spirateam.mylyn.core.internal.model;

import com.inflectra.spirateam.mylyn.core.internal.services.soap.RemoteWorkflowField;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.RemoteWorkflowCustomProperty;

/**
 * Represents a workflow field for a requirement
 * New in version 5.0
 * @author peter.geertsema
 *
 */
public class RequirementWorkflowField extends ArtifactWorkflowField {
	/**
	 * Creates a field from the SOAP object
	 * @param workflowField
	 */
	public RequirementWorkflowField(RemoteWorkflowField workflowField) {
		super(workflowField);
	}
	
	public RequirementWorkflowField(RemoteWorkflowCustomProperty workflowCustomProperties) {
		super(workflowCustomProperties);
	}
}