package ca.project.entity;

import java.sql.Timestamp;

public class Photo implements IPhoto {    
    private Integer id = null;
    private String description = null;
    private String fileName = null;
    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
    
    public Photo(Integer id, String description, String fileName, Timestamp createdAt) {
        this.id = id;
        this.description = description;     
        this.fileName = fileName;
        this.createdAt = createdAt;
    }
    
    public Photo() {
    	
    }
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getfileName() {
		return fileName;
	}

	public void setfileName(String fileName) {
		this.fileName = fileName;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
}