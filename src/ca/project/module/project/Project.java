package ca.project.module.project;

import ca.project.dao.PhotoDao;

public class Project {
	
	private PhotoDao m_mainHibernateDAO;

	public PhotoDao getM_mainHibernateDAO() {
		return m_mainHibernateDAO;
	}

	public void setM_mainHibernateDAO(PhotoDao hibernateDAO) {
		m_mainHibernateDAO = hibernateDAO;
	}


}
