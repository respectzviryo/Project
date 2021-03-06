package ca.project.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import ca.project.entity.Photo;

public class PhotoDao extends HibernateDaoSupport {

    public Photo getPhoto(Integer id) {
        return (Photo) getHibernateTemplate().get(Photo.class, id);
    }

    @SuppressWarnings("unchecked")
	public List<Photo> getPhotos() {
        return getHibernateTemplate().find("from Photo");
    }
    
    @SuppressWarnings("unchecked")
	public List<Photo> getPhotos(String tag) {
        return getHibernateTemplate().find("select photo from Photo photo join photo.tags as tags where tags.name = ?", tag);
    }

    public void savePhoto(Photo record) {
        getHibernateTemplate().saveOrUpdate(record);
    }

    public void removePhoto(Integer id) {
        Object photo = getHibernateTemplate().load(Photo.class, id);
        getHibernateTemplate().delete(photo);        
    }
}