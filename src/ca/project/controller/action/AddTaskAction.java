package ca.project.controller.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ca.project.dao.MainRecordDao;
import ca.project.entity.MainRecord;
import ca.project.view.form.AddTaskForm;

public class AddTaskAction extends Action {
	
	private MainRecordDao m_mainHibernateDAO;
	
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		AddTaskForm new_task = (AddTaskForm) form;
		
		MainRecord mainRecord = new MainRecord();
		mainRecord.setDescription(new_task.getDescription());
		mainRecord.setName(new_task.getName());
				
		getM_mainHibernateDAO().saveRecord(mainRecord);
		
		return mapping.findForward("tasks_page");		
	}

	public MainRecordDao getM_mainHibernateDAO() {
		return m_mainHibernateDAO;
	}

	public void setM_mainHibernateDAO(MainRecordDao hibernateDAO) {
		m_mainHibernateDAO = hibernateDAO;
	}

}
