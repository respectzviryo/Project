package ca.project.controller.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import ca.project.constants.RequestSessionKeys;
import ca.project.dao.CommentDao;
import ca.project.entity.Comment;
import ca.project.view.form.AddCommentForm;

public class AddCommentAction extends Action {
	private CommentDao m_commentHibernateDAO;

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		
		AddCommentForm newComment = (AddCommentForm) form;
		Comment comment = new Comment();
		
		comment.setAuthor(newComment.getAuthor());
		comment.setBody(newComment.getBody());
		comment.setPhotoId(newComment.getPhotoId());
		
		getM_commentHibernateDAO().saveComment(comment);
		
		request.setAttribute(RequestSessionKeys.COMMENT, comment);
		
		
		return mapping.findForward("comment");
	}

	public CommentDao getM_commentHibernateDAO() {
		return m_commentHibernateDAO;
	}

	public void setM_commentHibernateDAO(CommentDao hibernateDAO) {
		m_commentHibernateDAO = hibernateDAO;
	}

	

}
