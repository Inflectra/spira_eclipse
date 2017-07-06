package com.inflectra.spirateam.mylyn.core.internal.model;

import java.util.ArrayList;
import java.util.List;

import com.inflectra.spirateam.mylyn.core.internal.ArtifactType;
import com.inflectra.spirateam.mylyn.core.internal.SpiraTeamUtil;
import com.inflectra.spirateam.mylyn.core.internal.services.SpiraImportExport;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.RemoteRequirement;
/**
 * Represents a single requirement in SpiraTeam
 *
 * @author Inflectra Corporation
 */
public class Requirement
	extends Artifact
{
    protected int statusId;
    protected int authorId;
    protected String authorName;
    protected Integer importanceId;
    protected String importanceName;
    protected Integer releaseId;
    protected String releaseVersionNumber;
    protected boolean summary;
    protected Integer estimatedEffort;
    protected Integer componentId;
    protected Integer requirementTypeId;
    
    //Contains the collection of comments
    protected List<RequirementComment> comments = new ArrayList<RequirementComment>();

    public enum Key
    {
		//Requirement-specific attributes
    	TYPE("requirement.type"),
		STATUS_ID("requirement.statusId"),
		AUTHOR_ID("requirement.authorId"),
		IMPORTANCE_ID("requirement.importanceId"),
		RELEASE_ID("requirement.releaseId"),
		ESTIMATED_EFFORT("requirement.estimatedEffort"),
		COMMENT("requirement.comment");
		
		public static Key fromKey(String name)
		{
			for (Key key : Key.values())
			{
				if (key.getKey().equals(name))
				{
					return key;
				}
			}
			return null;
		}

		private String key;

		Key(String key)
		{
			this.key = key;
		}

		@Override
		public String toString()
		{
			return key;
		}

		public String getKey()
		{
			return key;
		}
	}
       
    /**
     * Creates a requirement based on its equivalent SOAP object
     * @param remoteRequirement The SOAP requirement
     */
    public Requirement(RemoteRequirement remoteRequirement)
    {
    	//Populate the cross-artifact type properties
    	PopulateGeneralProperties(remoteRequirement);
    	
    	//Set the various member variables
        this.name = remoteRequirement.getName().getValue();
        this.description = remoteRequirement.getDescription().getValue();
        this.creationDate = SpiraTeamUtil.convertDatesXml2Java(remoteRequirement.getCreationDate());
        this.lastUpdateDate = SpiraTeamUtil.convertDatesXml2Java(remoteRequirement.getLastUpdateDate());
        this.artifactId = remoteRequirement.getRequirementId().getValue();
        this.statusId = remoteRequirement.getStatusId().getValue();
        this.authorId = remoteRequirement.getAuthorId().getValue();
        this.authorName = remoteRequirement.getAuthorName().getValue();
        this.ownerId = remoteRequirement.getOwnerId().getValue();
        this.importanceId = remoteRequirement.getImportanceId().getValue();
        this.importanceName = remoteRequirement.getImportanceName().getValue();
        this.releaseId = remoteRequirement.getReleaseId().getValue();
        this.releaseVersionNumber = remoteRequirement.getReleaseVersionNumber().getValue();
        this.summary = remoteRequirement.isSummary();
        this.estimatedEffort = remoteRequirement.getEstimatedEffort().getValue();
        this.componentId = remoteRequirement.getComponentId().getValue();
        this.requirementTypeId = remoteRequirement.getRequirementTypeId();
    }
    
    /**
     * Converts this object into its soap equivalent
     * @return
     */
    public RemoteRequirement toSoapObject()
    {
    	//Set the properties on the SOAP object
    	RemoteRequirement remoteRequirement = new RemoteRequirement();
    	
        //First the artifact base properties
    	ExtractGeneralProperties(remoteRequirement);

    	//Next the requirement-specific ones
    	remoteRequirement.setRequirementId(SpiraImportExport.CreateJAXBInteger("RequirementId", this.artifactId));
    	remoteRequirement.setOwnerId(SpiraImportExport.CreateJAXBInteger("OwnerId", this.ownerId));
    	remoteRequirement.setAuthorId(SpiraImportExport.CreateJAXBInteger("AuthorId", this.authorId));
    	remoteRequirement.setReleaseId(SpiraImportExport.CreateJAXBInteger("ReleaseId", this.releaseId));
    	remoteRequirement.setName(SpiraImportExport.CreateJAXBString("Name", this.name));
    	remoteRequirement.setDescription(SpiraImportExport.CreateJAXBString("Description", this.description));
    	remoteRequirement.setCreationDate(SpiraTeamUtil.convertDatesJava2Xml(this.creationDate));
    	remoteRequirement.setLastUpdateDate(SpiraTeamUtil.convertDatesJava2Xml(this.lastUpdateDate));
    	remoteRequirement.setStatusId(SpiraImportExport.CreateJAXBInteger("StatusId", this.statusId));
    	remoteRequirement.setReleaseId(SpiraImportExport.CreateJAXBInteger("ReleaseId", this.releaseId));
    	remoteRequirement.setImportanceId(SpiraImportExport.CreateJAXBInteger("ImportanceId", this.importanceId));
    	remoteRequirement.setEstimatedEffort(SpiraImportExport.CreateJAXBInteger("EstimatedEffort", this.estimatedEffort));
    	remoteRequirement.setRequirementTypeId(this.requirementTypeId);
            	
        return remoteRequirement;
    }
    
    @Override
    public ArtifactType getArtifactType()
    {
    	return ArtifactType.REQUIREMENT;
    }
    
    /**
     * Gets the value of the artifact key (format is RQ<requirement-id>)
     * @return The prefixed requirement ID
     */
    @Override
    public String getArtifactKey()
    {
    	return getArtifactType().getPrefix() + this.artifactId;
    }

    /**
     * Gets the value of the statusId property.
     * 
     */
    public int getStatusId() {
        return statusId;
    }

    /**
     * Sets the value of the statusId property.
     * 
     */
    public void setStatusId(int value) {
        this.statusId = value;
    }

    /**
     * Gets the value of the authorId property.
     * 
     */
    public int getAuthorId() {
        return authorId;
    }

    /**
     * Sets the value of the authorId property.
     * 
     */
    public void setAuthorId(int value) {
        this.authorId = value;
    }

    /**
     * Gets the value of the authorName property.
     * 
     */
    public String getAuthorName()
    {
        return authorName;
    }
    
    /**
     * 
     * @return - The value of the componentId property
     */
    public Integer getComponentId() {
    	return componentId;
    }
    
    /**
     * 
     * @param componentId - The new value of the componentId property
     */
    public void setComponentId(Integer componentId) {
    	this.componentId=componentId;
    }
 
    /**
     * Sets the value of the authorName property.
     * 
     */
    public void setAuthorName(String value)
    {
        this.authorName = value;
    }

    /**
     * Gets the value of the importanceId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImportanceId() {
        return importanceId;
    }

    /**
     * Sets the value of the importanceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImportanceId(Integer value) {
        this.importanceId = value;
    }
    
    /**
     * Gets the value of the importanceName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImportanceName() {
        return importanceName;
    } 

    /**
     * Gets the value of the releaseId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getReleaseId() {
        return releaseId;
    }

    /**
     * Sets the value of the releaseId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setReleaseId(Integer value) {
        this.releaseId = value;
    }

    /**
     * Gets the value of the releaseVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReleaseVersionNumber() {
        return releaseVersionNumber;
    } 

    /**
     * Gets the value of the summary property.
     * 
     */
    public boolean isSummary() {
        return summary;
    }

    /**
     * Sets the value of the summary property.
     * 
     */
    public void setSummary(boolean value) {
        this.summary = value;
    }

    /**
     * Gets the value of the estimatedEffort property.
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEstimatedEffort() {
        return estimatedEffort;
    }

    /**
     * Sets the value of the estimatedEffort property.
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEstimatedEffort(Integer value) {
        this.estimatedEffort = value;
    }

	/**
	 * @return the comments
	 */
	public List<RequirementComment> getComments()
	{
		return this.comments;
	}
	
	/**
	 * Sets the value of the requirementTypeId property
	 * @param requirementTypeId The new value for the requirementTypeId property
	 */
	public void setRequirementTypeId(Integer requirementTypeId) {
		this.requirementTypeId=requirementTypeId;
	}
	
	/**
	 * 
	 * @return The value of the requirementTypeId property
	 */
	public Integer getRequirementTypeId() {
		return this.requirementTypeId;
	}
}
