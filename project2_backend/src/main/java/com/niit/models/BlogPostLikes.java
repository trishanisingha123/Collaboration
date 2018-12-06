package com.niit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
@Entity
public class BlogPostLikes {
	@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence3")
   @SequenceGenerator(name = "sequence3", sequenceName = "sequence3")
	private int likeId;
	@ManyToOne
	private BlogPost blogPost;
	public int getLikeId() {
		return likeId;
	}
	public void setLikeId(int likeId) {
		this.likeId = likeId;
	}
	public BlogPost getBlogPost() {
		return blogPost;
	}
	public void setBlogPost(BlogPost blogPost) {
		this.blogPost = blogPost;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@ManyToOne
	private User user;
	
	
	
}
