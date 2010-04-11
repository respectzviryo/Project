package ca.project.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import ca.project.entity.Comment;

public class CommentDao extends HibernateDaoSupport {
	
	public Comment getComment(Integer id) {
        return (Comment) getHibernateTemplate().get(Comment.class, id);
    }

    @SuppressWarnings("unchecked")
	public List<Comment> getComments() {
        return getHibernateTemplate().find("from Comment");
    }
    
    public void saveComment(Comment record) {
        getHibernateTemplate().saveOrUpdate(record);
    }

    public void removeComment(Integer id) {
        Object comment = getHibernateTemplate().load(Comment.class, id);
        getHibernateTemplate().delete(comment);        
    }

}
