package com.cjc.app.fl.master.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Documents {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int did;
	private String custid;    //*****///////////////////////  
	
	@Lob
	private byte[] pancard;
	@Lob
	private byte[] adharcard;
	@Lob
	private byte[] incomeProof;
	@Lob
	private byte[] signature;
	@Lob
	private byte[] addressProof;
	@Lob
	private byte[] productQuotation;
	@Lob
	private byte[] photo;
	@Lob
	private byte[] itrFile;
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public byte[] getPancard() {
		return pancard;
	}
	public void setPancard(byte[] pancard) {
		this.pancard = pancard;
	}
	public byte[] getAdharcard() {
		return adharcard;
	}
	public void setAdharcard(byte[] adharcard) {
		this.adharcard = adharcard;
	}
	public byte[] getIncomeProof() {
		return incomeProof;
	}
	public void setIncomeProof(byte[] incomeProof) {
		this.incomeProof = incomeProof;
	}
	public byte[] getSignature() {
		return signature;
	}
	public void setSignature(byte[] signature) {
		this.signature = signature;
	}
	public byte[] getAddressProof() {
		return addressProof;
	}
	public void setAddressProof(byte[] addressProof) {
		this.addressProof = addressProof;
	}
	
	public byte[] getProductQuotation() {
		return productQuotation;
	}
	public void setProductQuotation(byte[] productQuotation) {
		this.productQuotation = productQuotation;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public byte[] getItrFile() {
		return itrFile;
	}
	public void setItrFile(byte[] itrFile) {
		this.itrFile = itrFile;
	}



}
