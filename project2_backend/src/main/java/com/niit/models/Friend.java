package com.niit.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Friend")
public class Friend {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence3")
    @SequenceGenerator(name = "sequence3", sequenceName = "sequence3")
	private int friendId;
	@ManyToOne
	private User fromId;
	@ManyToOne
	private User toId;
	public int getFriendId() {
		return friendId;
	}
	public void setFriendId(int friendId) {
		this.friendId = friendId;
	}
	public User getFromId() {
		return fromId;
	}
	public void setFromId(User fromId) {
		this.fromId = fromId;
	}
	public User getToId() {
		return toId;
	}
	public void setToId(User toId) {
		this.toId = toId;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}
	private char status;

}
