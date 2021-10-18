package com.cjc.app.fl.master.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Guarantor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int garenterId;
	private String name;
	private String mobNo;
	private String adharcardNo;
	private String occupation;
	
	public int getGarenterId() {
		return garenterId;
	}
	public void setGarenterId(int garenterId) {
		this.garenterId = garenterId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public String getAdharcardNo() {
		return adharcardNo;
	}
	public void setAdharcardNo(String adharcardNo) {
		this.adharcardNo = adharcardNo;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}



}
