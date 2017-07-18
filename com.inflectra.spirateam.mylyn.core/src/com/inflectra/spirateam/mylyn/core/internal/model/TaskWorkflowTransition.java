package com.inflectra.spirateam.mylyn.core.internal.model;

import com.inflectra.spirateam.mylyn.core.internal.services.soap.RemoteWorkflowTransition;
/**
 * 
 * @author peter.geertsema
 *
 */
public class TaskWorkflowTransition {

	protected boolean executeByCreator;
    protected boolean executeByOwner;
    protected int taskStatusIDInput;
    protected String taskStatusNameInput;
    protected int taskStatusIDOutput;
    protected String taskStatusNameOutput;
    protected String name;
    protected int workflowID;
    protected int transitionID;
	
    /**
     * 
     * @param remoteWorkflowTaskTransition a SOAP object
     */
	public TaskWorkflowTransition(RemoteWorkflowTransition remoteWorkflowTaskTransition) {
		this.executeByCreator = remoteWorkflowTaskTransition.isExecuteByCreator();
        this.executeByOwner = remoteWorkflowTaskTransition.isExecuteByOwner();
        this.taskStatusIDInput = remoteWorkflowTaskTransition.getStatusIdInput();
        this.taskStatusNameInput = remoteWorkflowTaskTransition.getStatusNameInput().getValue();
        this.taskStatusIDOutput = remoteWorkflowTaskTransition.getStatusIdOutput();
        this.taskStatusNameOutput = remoteWorkflowTaskTransition.getStatusNameOutput().getValue();
        this.name = remoteWorkflowTaskTransition.getName().getValue();
        this.workflowID = remoteWorkflowTaskTransition.getWorkflowId();
        this.transitionID = remoteWorkflowTaskTransition.getTransitionId();
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
     * Gets the value of the taskStatusIDInput property.
     * 
     */
    public int getTaskStatusIDInput() {
        return taskStatusIDInput;
    }

    /**
     * Sets the value of the taskStatusIDInput property.
     * 
     */
    public void setTaskStatusIDInput(int value) {
        this.taskStatusIDInput = value;
    }

    /**
     * Gets the value of the taskStatusNameInput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskStatusNameInput() {
        return taskStatusNameInput;
    }

    /**
     * Sets the value of the taskStatusNameInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskStatusNameInput(String value) {
        this.taskStatusNameInput = value;
    }

    /**
     * Gets the value of the taskStatusIDOutput property.
     * 
     */
    public int getTaskStatusIDOutput() {
        return taskStatusIDOutput;
    }

    /**
     * Sets the value of the taskStatusIDOutput property.
     * 
     */
    public void setTaskStatusIDOutput(int value) {
        this.taskStatusIDOutput = value;
    }

    /**
     * Gets the value of the taskStatusNameOutput property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskStatusNameOutput() {
        return taskStatusNameOutput;
    }

    /**
     * Sets the value of the taskStatusNameOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskStatusNameOutput(String value) {
        this.taskStatusNameOutput = value;
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
