package ca.project.controller.action;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;

import ca.project.dao.MainRecordDao;
import ca.project.entity.MainRecord;
import ca.project.view.form.AddTaskForm;

public class AddTaskAction extends Action {

	private MainRecordDao m_mainHibernateDAO;

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		AddTaskForm newTask = (AddTaskForm) form;

		FormFile myFile = newTask.getTheFile();
		String fileName = myFile.getFileName();
		String strDirectory = "upload";

		String filePath = getServlet().getServletContext().getRealPath("/")
				+ strDirectory;

		boolean exists = (new File(filePath)).exists();
		if (!exists)
			(new File(filePath)).mkdir();

		if (!fileName.equals("")) {
			File fileToCreate = new File(filePath, fileName);
			// If file does not exists create file
			if (!fileToCreate.exists()) {
				FileOutputStream fileOutStream = new FileOutputStream(
						fileToCreate);
				fileOutStream.write(myFile.getFileData());
				fileOutStream.flush();
				fileOutStream.close();
			}
		}
		
		MainRecord mainRecord = new MainRecord();
		mainRecord.setDescription(newTask.getDescription());
		mainRecord.setName(newTask.getName());
		mainRecord.setfileName(fileName);

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
