package ca.project.entity;

import java.sql.Timestamp;

public class Comment implements IComment {
	
	private String author;
	private String body;
	private Integer id;
	private Integer photoId;
	private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
	
	
	public Comment() {

	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPhotoId() {
		return photoId;
	}
	public void setPhotoId(Integer photoId) {
		this.photoId = photoId;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
}
