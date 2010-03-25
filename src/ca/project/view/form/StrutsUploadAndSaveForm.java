package ca.project.view.form;

import org.apache.struts.action.*;
import org.apache.struts.upload.FormFile;



/**
* @author Amit Gupta
* @Web http://www.roseindia.net
* @Email struts@roseindia.net
*/

/**
 * Form bean for Struts File Upload.
 *
*/
public class StrutsUploadAndSaveForm extends ActionForm
{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private FormFile theFile;

  /**
   * @return Returns the theFile.
   */
  public FormFile getTheFile() {
    return theFile;
  }
  /**
   * @param theFile The FormFile to set.
   */
  public void setTheFile(FormFile theFile) {
    this.theFile = theFile;
  }
} 