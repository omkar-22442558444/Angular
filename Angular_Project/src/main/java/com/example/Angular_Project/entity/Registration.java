package com.example.Angular_Project.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Registration {
@Id
	int id;
	String username;
	String password;
	String emailId;
	String mobileNo;
	String gender;
	Date createdDate;
	String createdBy;
	public Registration(int id, String username, String password, String emailId, String mobileNo, String gender,
			Date createdDate, String createdBy) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.gender = gender;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
	}
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	@Override
	public String toString() {
		return "Registration [id=" + id + ", username=" + username + ", password=" + password + ", emailId=" + emailId
				+ ", mobileNo=" + mobileNo + ", gender=" + gender + ", createdDate=" + createdDate + ", createdBy="
				+ createdBy + "]";
	}
	
	
	
}
