package com.inflectra.spirateam.mylyn.core.internal.model;

import com.inflectra.spirateam.mylyn.core.internal.services.soap.RemoteWorkflowTransition;

/**
 * 
 * @author peter.geertsema
 */
public class RequirementWorkflowTransition {

	protected boolean executeByCreator;
    protected boolean executeByOwner;
    protected int requirementStatusIDInput;
    protected String requirementStatusNameInput;
    protected int requirementStatusIDOutput;
    protected String requirementStatusNameOutput;
    protected String name;
    protected int workflowID;
    protected int transitionID;
	
    /**
     * 
     * @param remoteWorkflowRequirementTransition a SOAP object
     */
	public RequirementWorkflowTransition(RemoteWorkflowTransition remoteWorkflowRequirementTransition) {
		this.executeByCreator = remoteWorkflowRequirementTransition.isExecuteByCreator();
        this.executeByOwner = remoteWorkflowRequirementTransition.isExecuteByOwner();
        this.requirementStatusIDInput = remoteWorkflowRequirementTransition.getStatusIdInput();
        this.requirementStatusNameInput = remoteWorkflowRequirementTransition.getStatusNameInput().getValue();
        this.requirementStatusIDOutput = remoteWorkflowRequirementTransition.getStatusIdOutput();
        this.requirementStatusNameOutput = remoteWorkflowRequirementTransition.getStatusNameOutput().getValue();
        this.name = remoteWorkflowRequirementTransition.getName().getValue();
        this.workflowID = remoteWorkflowRequirementTransition.getWorkflowId();
        this.transitionID = remoteWorkflowRequirementTransition.getTransitionId();
	}
	
	/**
     * Gets the value of the executeByDetector property.
     * 
     */
    public boolean isExecuteByCreator() {
        return executeByCreator;
    }

    /**
     * Sets the value of the executeByDetector property.
     * 
     */
    public void setExecuteByCreator(boolean value) {
        this.executeByCreator = value;
    }

    /**
     * Gets the value of the executeByOwner property.
     * 
     */
    public boolean isExecuteByOwner() {
        return executeByOwner;
    }

    /**
     * Sets the value of the executeByOwner property.
     * 
     */
    public void setExecuteByOwner(boolean value) {
        this.executeByOwner = value;
    }

    /**
     * Gets the value of the requirementStatusIDInput property.
     * 
     */
    public int getRequirementStatusIDInput() {
        return requirementStatusIDInput;
    }

    /**
     * Sets the value of the requirementStatusIDInput property.
     * 
     */
    public void setRequirementStatusIDInput(int value) {
        this.requirementStatusIDInput = value;
    }

    /**
     * Gets the value of the requirementStatusNameInput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequirementStatusNameInput() {
        return requirementStatusNameInput;
    }

    /**
     * Sets the value of the requirementStatusNameInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequirementStatusNameInput(String value) {
        this.requirementStatusNameInput = value;
    }

    /**
     * Gets the value of the requirementStatusIDOutput property.
     * 
     */
    public int getRequirementStatusIDOutput() {
        return requirementStatusIDOutput;
    }

    /**
     * Sets the value of the requirementStatusIDOutput property.
     * 
     */
    public void setRequirementStatusIDOutput(int value) {
        this.requirementStatusIDOutput = value;
    }

    /**
     * Gets the value of the requirementStatusNameOutput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequirementStatusNameOutput() {
        return requirementStatusNameOutput;
    }

    /**
     * Sets the value of the requirementStatusNameOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequirementStatusNameOutput(String value) {
        this.requirementStatusNameOutput = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the workflowID property.
     * 
     */
    public int getWorkflowID() {
        return workflowID;
    }

    /**
     * Sets the value of the workflowID property.
     * 
     */
    public void setWorkflowID(int value) {
        this.workflowID = value;
    }

    /**
     * Gets the value of the transitionID property.
     * 
     */
    public int getTransitionID() {
        return transitionID;
    }

    /**
     * Sets the value of the transitionID property.
     * 
     */
    public void setTransitionID(int value) {
        this.transitionID = value;
    }
}
