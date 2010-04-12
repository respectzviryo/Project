package ca.project.entity;

import java.sql.Timestamp;
import java.util.Collections;
import java.util.List;

public class Photo implements IPhoto {    
    private Integer id = null;
    private String description = null;
    private String fileName = null;
    private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
    private List<Tag> tags = null;
    private List<Comment> comments = null;
    

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

	@SuppressWarnings("unchecked")
	public List<Tag> getTags() {
		tags.removeAll(Collections.singletonList(null));
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	
	public List<Comment> getComments() {
		comments.removeAll(Collections.singletonList(null));  
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
    
}
