package ca.project.controller.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ca.project.dao.MainRecordDao;
import ca.project.entity.MainRecord;



public class FormTaskListAction extends Action {

	private MainRecordDao m_mainHibernateDAO;

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		HttpSession session = request.getSession();

		List<MainRecord> records = m_mainHibernateDAO.getRecords();
		session.setAttribute("tasks", records);

		return mapping.findForward("tasksList");
	}

	public MainRecordDao getM_mainHibernateDAO() {
		return m_mainHibernateDAO;
	}

	public void setM_mainHibernateDAO(MainRecordDao hibernateDAO) {
		m_mainHibernateDAO = hibernateDAO;
	}

}
