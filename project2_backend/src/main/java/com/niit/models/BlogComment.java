package com.niit.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="blogcomment_table")
public class BlogComment {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence3")
    @SequenceGenerator(name = "sequence3", sequenceName = "sequence3")
private int commentId;
	@ManyToOne
private BlogPost blogPost;
	@ManyToOne
private User commentedBy;
public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public BlogPost getBlogPost() {
		return blogPost;
	}
	public void setBlogPost(BlogPost blogPost) {
		this.blogPost = blogPost;
	}
	public User getCommentedBy() {
		return commentedBy;
	}
	public void setCommentedBy(User commentedBy) {
		this.commentedBy = commentedBy;
	}
	public Date getCommentedOn() {
		return commentedOn;
	}
	public void setCommentedOn(Date commentedOn) {
		this.commentedOn = commentedOn;
	}
	public String getCommentTxt() {
		return commentTxt;
	}
	public void setCommentTxt(String commentTxt) {
		this.commentTxt = commentTxt;
	}
private Date commentedOn;
private String commentTxt;

}
