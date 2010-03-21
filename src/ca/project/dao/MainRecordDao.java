package ca.project.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import ca.project.entity.MainRecord;

public class MainRecordDao extends HibernateDaoSupport {

    public MainRecord getRecord(Integer id) {
        return (MainRecord) getHibernateTemplate().get(MainRecord.class, id);
    }

    public List<MainRecord> getRecords() {
        return getHibernateTemplate().find("from ca.project.entity.MainRecord");
    }

    public void saveRecord(MainRecord record) {
        getHibernateTemplate().saveOrUpdate(record);
    }

    public void removeRecord(Long id) {
        Object record = getHibernateTemplate().load(MainRecord.class, id);
        getHibernateTemplate().delete(record);
    }
}