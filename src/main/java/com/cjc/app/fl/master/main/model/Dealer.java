package com.cjc.app.fl.master.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Dealer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int did;
	private String dname;
	private String dealerAcctNo;
	private String dealerMoBNo;
	private String email;
	
	@OneToOne(cascade = CascadeType.ALL)
	private BankMaster dealerBank;
	private String status;

	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDealerAcctNo() {
		return dealerAcctNo;
	}
	public void setDealerAcctNo(String dealerAcctNo) {
		this.dealerAcctNo = dealerAcctNo;
	}
	public String getDealerMoBNo() {
		return dealerMoBNo;
	}
	public void setDealerMoBNo(String dealerMoBNo) {
		this.dealerMoBNo = dealerMoBNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public BankMaster getDealerBank() {
		return dealerBank;
	}
	public void setDealerBank(BankMaster dealerBank) {
		this.dealerBank = dealerBank;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}


}
