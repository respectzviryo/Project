package ca.project.entity;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

public class Photo implements IPhoto {    
    private Integer id = null;
    private String description = null;
    private String fileName = null;
    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
    private List tags = null;
    
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

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List tags) {
		this.tags = tags;
	}



}
