package ca.project.controller.action;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ca.project.dao.PhotoDao;

public class RemoveTaskAction extends Action {

	private PhotoDao m_mainHibernateDAO;

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		Integer id = null;
		try {
			id = Integer.parseInt(request.getParameter("id"));
		
			String fileName = getM_mainHibernateDAO().getPhoto(id).getfileName();
			String strDirectory = "upload";
			String filePath = getServlet().getServletContext().getRealPath("/") + strDirectory + "/" + fileName;
			File file = new File(filePath);
			boolean exists = (file).exists();
			if (exists)
				file.delete();
			
			getM_mainHibernateDAO().removePhoto(id);

		} catch (Exception e) {
			System.out.println("could not remove record. request id = "
					+ String.valueOf(id));
		}

		return mapping.findForward("tasks_page");
	}

	public PhotoDao getM_mainHibernateDAO() {
		return m_mainHibernateDAO;
	}

	public void setM_mainHibernateDAO(PhotoDao hibernateDAO) {
		m_mainHibernateDAO = hibernateDAO;
	}

}
