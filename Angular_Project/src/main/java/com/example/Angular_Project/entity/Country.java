package com.example.Angular_Project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {
 @Id
 int cid;
	String cname;
	
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(String cname, int cid) {
		super();
		this.cname = cname;
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	@Override
	public String toString() {
		return "Country [cname=" + cname + ", cid=" + cid + "]";
	}
	
}
