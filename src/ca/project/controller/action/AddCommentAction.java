package ca.project.controller.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ca.project.dao.PhotoDao;
import ca.project.view.form.AddCommentForm;

public class AddCommentAction extends Action {
	private PhotoDao m_mainHibernateDAO;

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		
		AddCommentForm newComment = (AddCommentForm) form;
		
		
		return mapping.findForward("comment");
	}

	public PhotoDao getM_mainHibernateDAO() {
		return m_mainHibernateDAO;
	}

	public void setM_mainHibernateDAO(PhotoDao hibernateDAO) {
		m_mainHibernateDAO = hibernateDAO;
	}

}
