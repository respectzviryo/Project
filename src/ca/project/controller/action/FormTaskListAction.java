package ca.project.controller.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ca.project.constants.RequestSessionKeys;
import ca.project.dao.PhotoDao;
import ca.project.dao.TagDao;
import ca.project.entity.Photo;

public class FormTaskListAction extends Action {

	private PhotoDao m_mainHibernateDAO;
	private TagDao m_tagHibernateDAO;

	public TagDao getM_tagHibernateDAO() {
		return m_tagHibernateDAO;
	}

	public void setM_tagHibernateDAO(TagDao hibernateDAO) {
		m_tagHibernateDAO = hibernateDAO;
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		List<Photo> records = m_mainHibernateDAO.getPhotos();
		request.setAttribute(RequestSessionKeys.PHOTO_LIST, records);
		request.setAttribute(RequestSessionKeys.PHOTOS_AMMOUNT, records.size());
		
		return mapping.findForward("tasksList");
	}

	public PhotoDao getM_mainHibernateDAO() {
		return m_mainHibernateDAO;
	}

	public void setM_mainHibernateDAO(PhotoDao hibernateDAO) {
		m_mainHibernateDAO = hibernateDAO;
	}

}
