package com.cjc.app.fl.master.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PreviousLoanDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;
	private String laonType;
	private long loanAmount;
	private long remaingLoan;
	private int tenurePending;
	private String previousLoanBank;               //////////**********************///////////////////////
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getLaonType() {
		return laonType;
	}
	public void setLaonType(String laonType) {
		this.laonType = laonType;
	}
	public long getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(long loanAmount) {
		this.loanAmount = loanAmount;
	}
	public long getRemaingLoan() {
		return remaingLoan;
	}
	public void setRemaingLoan(long remaingLoan) {
		this.remaingLoan = remaingLoan;
	}
	public int getTenurePending() {
		return tenurePending;
	}
	public void setTenurePending(int tenurePending) {
		this.tenurePending = tenurePending;
	}
	public String getPreviousLoanBank() {
		return previousLoanBank;
	}
	public void setPreviousLoanBank(String previousLoanBank) {
		this.previousLoanBank = previousLoanBank;
	}



}
