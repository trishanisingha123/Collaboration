package com.niit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="notification_table")
public class Notification {
	@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence3")
   @SequenceGenerator(name = "sequence3", sequenceName = "sequence3")
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUserToBeNotified() {
		return userToBeNotified;
	}
	public void setUserToBeNotified(User email) {
		this.userToBeNotified = email;
	}
	public String getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	public String getBlogTitle() {
		return blogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	public String getRejectionReason() {
		return rejectionReason;
	}
	public void setRejectionReason(String rejectionReason) {
		this.rejectionReason = rejectionReason;
	}
	public boolean isViewed() {
		return viewed;
	}
	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}
	@ManyToOne
	private User userToBeNotified;
	private String approvalStatus;
	private String blogTitle; 
	private String rejectionReason;
	private boolean viewed;
	

}
