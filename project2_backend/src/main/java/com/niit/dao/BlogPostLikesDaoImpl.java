package com.niit.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.models.BlogPost;
import com.niit.models.BlogPostLikes;
import com.niit.models.User;

@Repository
@Transactional
public class BlogPostLikesDaoImpl implements BlogPostLikesDao {
	@Autowired
private SessionFactory sessionFactory;
	public BlogPostLikes hasUserLikedBlogPost(int blogPostId, String email) {
		Session session=sessionFactory.getCurrentSession();
		Query query =session.createQuery("from BlogPostLikes where blogPost.id=? and user.email=?");
		query.setInteger(0,blogPostId);
		query.setString(1, email);
		BlogPostLikes blogPostLikes=(BlogPostLikes)query.uniqueResult();
		return blogPostLikes;
	}
	public BlogPost updateLikes(int blogPostId, String email) {
		Session session=sessionFactory.getCurrentSession();
		BlogPostLikes blogPostLikes= hasUserLikedBlogPost(blogPostId,email);
		BlogPost blogPost=(BlogPost)session.get(BlogPost.class,blogPostId);
		User user=(User)session.get(User.class,email);
		if(blogPostLikes==null)
		{
			blogPostLikes = new BlogPostLikes();
			blogPostLikes.setBlogPost(blogPost);
			blogPostLikes.setUser(user);
			session.save(blogPostLikes);
			blogPost.setLikes(blogPost.getLikes()+1);
			session.update(blogPost);
		}
		else{
			session.delete(blogPostLikes);
			blogPost.setLikes(blogPost.getLikes()-1);
			session.update(blogPost);
		}
	return blogPost;
	}
	public List<BlogPostLikes> userLikes(int blogPostId) {
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from BlogPostLikes where blogPost.id=?");
		query.setInteger(0, blogPostId);
		return query.list();
	}

	}

