package com.example.Angular_Project.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private String emailid;
	private long mobile_no;
	private String gender;
	private String department;
	private String status;
	private Date created_date;
	private String created_date_by;
	private Date update_date;
	private String updated_date_by;
	@OneToOne(targetEntity = Country.class,cascade=CascadeType.ALL)
	private Country country;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String name, String emailid, long mobile_no, String gender, String department,
			String status, Date created_date, String created_date_by, Date update_date, String updated_date_by,
			Country country) {
		super();
		this.id = id;
		this.name = name;
		this.emailid = emailid;
		this.mobile_no = mobile_no;
		this.gender = gender;
		this.department = department;
		this.status = status;
		this.created_date = created_date;
		this.created_date_by = created_date_by;
		this.update_date = update_date;
		this.updated_date_by = updated_date_by;
		this.country = country;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public long getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public String getCreated_date_by() {
		return created_date_by;
	}
	public void setCreated_date_by(String created_date_by) {
		this.created_date_by = created_date_by;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	public String getUpdated_date_by() {
		return updated_date_by;
	}
	public void setUpdated_date_by(String updated_date_by) {
		this.updated_date_by = updated_date_by;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", emailid=" + emailid + ", mobile_no=" + mobile_no
				+ ", gender=" + gender + ", department=" + department + ", status=" + status + ", created_date="
				+ created_date + ", created_date_by=" + created_date_by + ", update_date=" + update_date
				+ ", updated_date_by=" + updated_date_by + ", country=" + country + "]";
	}
	
	
	

}
