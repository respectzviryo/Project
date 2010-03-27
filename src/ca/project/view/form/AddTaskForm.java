package ca.project.view.form;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

public class AddTaskForm extends ActionForm {
	private static final long serialVersionUID = 1L;

	private String description;
	private FormFile theFile;
	
	public FormFile getTheFile() {
		return theFile;
	}

	public void setTheFile(FormFile theFile) {
		this.theFile = theFile;
	}

	public AddTaskForm()
    {
        super();
    }

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
