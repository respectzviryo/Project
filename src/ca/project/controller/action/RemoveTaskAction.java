package ca.project.controller.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ca.project.dao.MainRecordDao;

public class RemoveTaskAction extends Action {

	private MainRecordDao m_mainHibernateDAO;

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		Integer id = null;
		try {
			id = Integer.parseInt(request.getParameter("id"));

			getM_mainHibernateDAO().removeRecord(id);
		} catch (Exception e) {
			System.out.println("could not remove record. request id = "
					+ String.valueOf(id));
		}

		return mapping.findForward("tasks_page");
	}

	public MainRecordDao getM_mainHibernateDAO() {
		return m_mainHibernateDAO;
	}

	public void setM_mainHibernateDAO(MainRecordDao hibernateDAO) {
		m_mainHibernateDAO = hibernateDAO;
	}

}