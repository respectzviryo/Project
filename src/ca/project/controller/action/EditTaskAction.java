package ca.project.controller.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ca.project.constants.RequestSessionKeys;
import ca.project.dao.PhotoDao;
import ca.project.entity.Photo;

public class EditTaskAction extends Action {

	private PhotoDao m_mainHibernateDAO;

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		Integer id = null;
		Photo record = null;
		try {
			id = Integer.parseInt(request.getParameter("id"));

			record = getM_mainHibernateDAO().getPhoto(id);
		} catch (Exception e) {
			System.out.println("could not find record. request id = "
					+ String.valueOf(id));
		}

		request.setAttribute(RequestSessionKeys.PHOTO, record);

		return mapping.findForward("updateTask");
	}

	public PhotoDao getM_mainHibernateDAO() {
		return m_mainHibernateDAO;
	}

	public void setM_mainHibernateDAO(PhotoDao hibernateDAO) {
		m_mainHibernateDAO = hibernateDAO;
	}

}
