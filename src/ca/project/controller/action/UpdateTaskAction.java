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
			FormFile myFile = updateForm.getTheFile();
			String fileName = myFile.getFileName();
			String filePath = getServlet().getServletContext().getRealPath("/upload");
			File fileToCreate = new File(filePath, fileName);
			if (!fileToCreate.exists()) {
				FileOutputStream fileOutStream = new FileOutputStream(fileToCreate);
				fileOutStream.write(myFile.getFileData());
				fileOutStream.flush();
				fileOutStream.close();
			}
			
			id = Integer.parseInt(updateForm.getId());
			Photo photo = getM_mainHibernateDAO().getPhoto(id);
			photo.setDescription(updateForm.getDescription());
			photo.setfileName(fileName);
			getM_mainHibernateDAO().savePhoto(photo);
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
