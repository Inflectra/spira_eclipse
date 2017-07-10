package com.inflectra.spirateam.mylyn.core.internal.model;

import com.inflectra.spirateam.mylyn.core.internal.services.soap.RemoteWorkflowCustomProperty;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.RemoteWorkflowField;

public class IncidentWorkflowField extends ArtifactWorkflowField
{
	/**
	 * Used when created from a standard field
	 * 
	 * @param remoteWorkflowField
	 */
	public IncidentWorkflowField(RemoteWorkflowField remoteWorkflowField)
	{
		super(remoteWorkflowField);
	}

	/**
	 * Used when created from a custom property
	 * 
	 * @param remoteWorkflowCustomProperty
	 */
	public IncidentWorkflowField(RemoteWorkflowCustomProperty remoteWorkflowCustomProperty)
	{
		super(remoteWorkflowCustomProperty);
	}
}