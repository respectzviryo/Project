package ca.project.module.project;

import ca.project.dao.MainRecordDao;

public class Project {
	
	private MainRecordDao m_mainHibernateDAO;

	public MainRecordDao getM_mainHibernateDAO() {
		return m_mainHibernateDAO;
	}

	public void setM_mainHibernateDAO(MainRecordDao hibernateDAO) {
		m_mainHibernateDAO = hibernateDAO;
	}


}
