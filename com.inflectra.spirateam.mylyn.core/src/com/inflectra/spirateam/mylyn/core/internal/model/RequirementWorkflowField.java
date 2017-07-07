package com.inflectra.spirateam.mylyn.core.internal.model;

import com.inflectra.spirateam.mylyn.core.internal.services.soap.RemoteWorkflowField;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.RemoteWorkflowCustomProperty;

/**
 * Represents a workflow field for a requirement
 * New in version 5.0
 * @author peter.geertsema
 *
 */
public class RequirementWorkflowField {
	
	protected String fieldCaption;
	protected String fieldName;
	protected int fieldID;
	/**
	 * Represents the current field state ID
	 */
	protected int fieldStatus;
	
	
	/**
	 * Creates a field from the SOAP object
	 * @param workflowField
	 */
	public RequirementWorkflowField(RemoteWorkflowField workflowField) {
		this.fieldCaption = workflowField.getFieldCaption().getValue();
		this.fieldName = workflowField.getFieldName().getValue();
		this.fieldID = workflowField.getFieldId();
		this.fieldStatus = workflowField.getFieldStateId();
	}
	
	public RequirementWorkflowField(RemoteWorkflowCustomProperty workflowCustomProperties) {
		this.fieldCaption = workflowCustomProperties.getFieldCaption().getValue();
		this.fieldName = workflowCustomProperties.getFieldName().getValue();
		this.fieldID = workflowCustomProperties.getCustomPropertyId();
		this.fieldStatus = workflowCustomProperties.getFieldStateId();
	}
	
	/**
	 * Gets the value of the fieldCaption property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFieldCaption()
	{
		return fieldCaption;
	}
	
	/**
	 * Gets the value of the fieldName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFieldName()
	{
		return fieldName;
	}
	
	/**
	 * Gets the value of the fieldID property.
	 * 
	 */
	public int getFieldID()
	{
		return fieldID;
	}
	
	/**
	 * Gets the value of the fieldStatus property.
	 * 
	 */
	public int getFieldStatus()
	{
		return fieldStatus;
	}
}