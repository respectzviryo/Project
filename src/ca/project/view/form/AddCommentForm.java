package ca.project.view.form;

import org.apache.struts.action.ActionForm;

public class AddCommentForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	
	private Integer photoId;
	private String author;
	private String body;
	
	public AddCommentForm()
    {
        super();
    }
	
	public Integer getPhotoId() {
		return photoId;
	}
	public void setPhotoId(Integer photoId) {
		this.photoId = photoId;
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
	

}
