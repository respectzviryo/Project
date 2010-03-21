package ca.project.view.form;

import org.apache.struts.action.ActionForm;

public class BeginForm extends ActionForm
{
	private static final long serialVersionUID = 1L;

	private String user;
	
	public BeginForm()
    {
        super();
    }

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	
	
}