package ca.project.controller.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ca.project.constants.RequestSessionKeys;
import ca.project.dao.MainRecordDao;
import ca.project.entity.MainRecord;

public class EditTaskAction extends Action {

	private MainRecordDao m_mainHibernateDAO;

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		Integer id = null;
		MainRecord record = null;
		try {
			id = Integer.parseInt(request.getParameter("id"));

			record = getM_mainHibernateDAO().getRecord(id);
		} catch (Exception e) {
			System.out.println("could not find record. request id = "
					+ String.valueOf(id));
		}

		request.setAttribute(RequestSessionKeys.TASK, record);

		return mapping.findForward("updateTask");
	}

	public MainRecordDao getM_mainHibernateDAO() {
		return m_mainHibernateDAO;
	}

	public void setM_mainHibernateDAO(MainRecordDao hibernateDAO) {
		m_mainHibernateDAO = hibernateDAO;
	}

}
