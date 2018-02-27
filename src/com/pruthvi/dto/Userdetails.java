package com.pruthvi.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="User_details")
public class Userdetails {

	@Id
	@Column(name="id")
	private int UserId;
	
	@Column(name="Name")
	private String UserName;
	
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getName() {
		return UserName;
	}
	public void setName(String name) {
		UserName = name;
	}
	
}
