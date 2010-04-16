package ca.test.testcases;

import java.io.File;

import servletunit.struts.MockStrutsTestCase;
import ca.project.view.form.BeginForm;

public class SomeTest extends MockStrutsTestCase {
	
	public static final String USER_NAME = "eugenek";
	
	private BeginForm beginForm;
	
	public SomeTest(String name) {
		super(name);
	}
	
	 public void setUp() throws Exception { 
         super.setUp(); 
         setServletConfigFile("D:/PROJECT/Project/dist/webapps/Project/WEB-INF/web.xml");
         
//         setContextDirectory(new File("WebRoot"));
         setInitParameter("validating","false"); 
     } 
	
	
	
	
	public void testShouldOpentBeginPage() {
		setRequestPathInfo("/begin");
        actionPerform();
        verifyNoActionErrors();
    }
	
	public void testShouldStoreUserToSession() {
		setRequestPathInfo("/beginAction");
		beginForm = new BeginForm();
		beginForm.setUser(USER_NAME);
		
		setActionForm(beginForm);
        actionPerform();
        verifyNoActionErrors();
        
        assertEquals(USER_NAME, request.getSession().getAttribute("user"));
    }
	
	

}
