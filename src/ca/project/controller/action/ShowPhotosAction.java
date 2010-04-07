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

public class ShowPhotosAction extends Action {

	private PhotoDao m_mainHibernateDAO;
	private TagDao m_tagHibernateDAO;
	public PhotoDao getM_mainHibernateDAO() {
		return m_mainHibernateDAO;
	}
	public void setM_mainHibernateDAO(PhotoDao hibernateDAO) {
		m_mainHibernateDAO = hibernateDAO;
	}
	public TagDao getM_tagHibernateDAO() {
		return m_tagHibernateDAO;
	}
	public void setM_tagHibernateDAO(TagDao hibernateDAO) {
		m_tagHibernateDAO = hibernateDAO;
	}
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		String tag = request.getParameter("tag");
		boolean useTag = (tag != null && !tag.equals(""));
		List<Photo> records = (useTag ? m_mainHibernateDAO.getPhotos(tag) : m_mainHibernateDAO.getPhotos());
		request.setAttribute(RequestSessionKeys.PHOTO_LIST, records);
		
		return mapping.findForward("photoList");
	}

}
