package ca.project.controller.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ca.project.dao.PhotoDao;
import ca.project.entity.Photo;
import ca.project.view.form.UpdateTaskForm;

public class UpdateTaskAction extends Action {
	private PhotoDao m_mainHibernateDAO;

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		UpdateTaskForm updateForm = (UpdateTaskForm) form; 
		Integer id = null;
		try {
			id = Integer.parseInt(updateForm.getId());
			Photo record = getM_mainHibernateDAO().getPhoto(id);
			record.setDescription(updateForm.getDescription());
			getM_mainHibernateDAO().savePhoto(record);
		} catch (Exception e) {
			System.out.println("could not update record. request id = "
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
