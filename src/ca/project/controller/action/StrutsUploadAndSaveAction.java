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

import ca.project.view.form.StrutsUploadAndSaveForm;

/**
 * @author Amit Gupta
 * @Web http://www.roseindia.net
 * @Email struts@roseindia.net
 */

/**
 * Struts File Upload Action Form.
 * 
 */
public class StrutsUploadAndSaveAction extends Action {
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		StrutsUploadAndSaveForm myForm = (StrutsUploadAndSaveForm) form;

		// Process the FormFile
		FormFile myFile = myForm.getTheFile();
//		String contentType = myFile.getContentType();
		// Get the file name
		String fileName = myFile.getFileName();
		// int fileSize = myFile.getFileSize();
//		byte[] fileData = myFile.getFileData();
		// Get the servers upload directory real path name
		String strDirectory = "upload";
		
		String filePath = getServlet().getServletContext().getRealPath("/")
				+ strDirectory;
		
		boolean exists = (new File(filePath)).exists();
		if (!exists)
			(new File(filePath)).mkdir();
		
		/* Save file on the server */
		if (!fileName.equals("")) {
			System.out.println("Server path:" + filePath);
			// Create file
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
		// Set file name to the request object
		request.setAttribute("fileName", fileName);

		return mapping.findForward("success");
	}
}