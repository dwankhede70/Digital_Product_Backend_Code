package com.cjc.app.fl.master.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cibil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String panstatus;
	private int cibilscore;
	private String cibilgenerateddate;
	private String oeremark;
	private String cibilgeneratedby;              // cibilForm object
	
	@OneToOne(cascade = CascadeType.ALL)          // id =1
	private CustomerEnquiry enqid;                      

	
	

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getPanstatus() {
		return panstatus;
	}

	public void setPanstatus(String panstatus) {
		this.panstatus = panstatus;
	}

	public int getCibilscore() {
		return cibilscore;
	}

	public void setCibilscore(int cibilscore) {
		this.cibilscore = cibilscore;
	}

	public String getCibilgenerateddate() {
		return cibilgenerateddate;
	}

	public void setCibilgenerateddate(String cibilgenerateddate) {
		this.cibilgenerateddate = cibilgenerateddate;
	}

	public String getOeremark() {
		return oeremark;
	}

	public void setOeremark(String oeremark) {
		this.oeremark = oeremark;
	}

	public String getCibilgeneratedby() {
		return cibilgeneratedby;
	}

	public void setCibilgeneratedby(String cibilgeneratedby) {
		this.cibilgeneratedby = cibilgeneratedby;
	}

	public CustomerEnquiry getEnqid() {
		return enqid;
	}

	public void setEnqid(CustomerEnquiry enqid) {
		this.enqid = enqid;
	}




}
