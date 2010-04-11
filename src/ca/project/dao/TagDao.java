package ca.project.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import ca.project.entity.Tag;

public class TagDao extends HibernateDaoSupport {
	
	public Tag getTag(Integer id) {
        return (Tag) getHibernateTemplate().get(Tag.class, id);
    }

    @SuppressWarnings("unchecked")
	public List<Tag> getTags() {
        return getHibernateTemplate().find("from Tag");
    }

    public void saveTag(Tag record) {
        getHibernateTemplate().saveOrUpdate(record);
    }

    public void removeTag(Integer id) {
        Object tag = getHibernateTemplate().load(Tag.class, id);
        getHibernateTemplate().delete(tag);        
    }

}
