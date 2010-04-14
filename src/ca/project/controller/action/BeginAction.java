package ca.project.controller.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ca.project.constants.RequestSessionKeys;
import ca.project.view.form.BeginForm;

public class BeginAction extends Action {

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		BeginForm user_form = (BeginForm) form;
		

		HttpSession session = request.getSession();
		session.setAttribute(RequestSessionKeys.USER_NAME, user_form.getUser());
		return mapping.findForward("tasks_page");
	}

}
