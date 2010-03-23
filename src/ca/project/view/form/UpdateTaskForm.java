package ca.project.view.form;

import org.apache.struts.action.ActionForm;

public class UpdateTaskForm extends ActionForm {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private String description;
	
	public UpdateTaskForm()
    {
        super();
    }

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
}
