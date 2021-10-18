package com.cjc.app.fl.master.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class CustomerDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int custid;
	private String name;
	private String mobNo;
	private String email;
	
	private long downPayment;
	private String permanetAddress;
	private String localAddress;
	private long requiredAmount;
	private int tenure;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Guarantor guarantor;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PreviousLoanDetails preLoanDetails;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Dealer dealer;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Product product;
		
//	@OneToOne(cascade = CascadeType.ALL)
//	private Documents documents;
	
	
	
	
//	public Documents getDocuments() {
//		return documents;
//	}
//
//	public void setDocuments(Documents documents) {
//		this.documents = documents;
//	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public long getDownPayment() {
		return downPayment;
	}

	public void setDownPayment(long downPayment) {
		this.downPayment = downPayment;
	}

	public String getPermanetAddress() {
		return permanetAddress;
	}

	public void setPermanetAddress(String permanetAddress) {
		this.permanetAddress = permanetAddress;
	}

	public String getLocalAddress() {
		return localAddress;
	}

	public void setLocalAddress(String localAddress) {
		this.localAddress = localAddress;
	}

	public long getRequiredAmount() {
		return requiredAmount;
	}

	public void setRequiredAmount(long requiredAmount) {
		this.requiredAmount = requiredAmount;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}

	public Guarantor getGuarantor() {
		return guarantor;
	}

	public void setGuarantor(Guarantor guarantor) {
		this.guarantor = guarantor;
	}

	public PreviousLoanDetails getPreLoanDetails() {
		return preLoanDetails;
	}

	public void setPreLoanDetails(PreviousLoanDetails preLoanDetails) {
		this.preLoanDetails = preLoanDetails;
	}

	public Dealer getDealer() {
		return dealer;
	}

	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	public Product getVehicle() {
		return product;
	}

	public void setVehicle(Product product) {
		this.product = product;
	}




}
