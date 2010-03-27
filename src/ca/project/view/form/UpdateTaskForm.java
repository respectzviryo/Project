package ca.project.view.form;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

public class UpdateTaskForm extends ActionForm {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String description;
	private FormFile theFile;
	
	public UpdateTaskForm()
    {
        super();
    }


	public FormFile getTheFile() {
		return theFile;
	}


	public void setTheFile(FormFile theFile) {
		this.theFile = theFile;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
