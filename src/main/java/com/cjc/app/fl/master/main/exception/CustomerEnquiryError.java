package com.cjc.app.fl.master.main.exception;

public class CustomerEnquiryError {
	
	private int errorcode;              // to store error status  e.g 500
	private String customermessage;     // to store custom  message
	

	public CustomerEnquiryError(int errorcode, String customermessage) {
		super();
		this.errorcode = errorcode;
		this.customermessage = customermessage;
	}
	
	public int getErrorcode() {
		return errorcode;
	}


	public void setErrorcode(int errorcode) {
		this.errorcode = errorcode;
	}


	public String getCustomermessage() {
		return customermessage;
	}


	public void setCustomermessage(String customermessage) {
		this.customermessage = customermessage;
	}



}
