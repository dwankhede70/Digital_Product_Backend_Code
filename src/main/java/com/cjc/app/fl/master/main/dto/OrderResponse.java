package com.cjc.app.fl.master.main.dto;

public class OrderResponse {
	
	private int enqId;                   
	private String name;
	private String email;
	
	private int cid;                     
	private int cibilscore;
	private String oeremark;
	
	
	public OrderResponse(int enqId, String name, String email, int cid, int cibilscore, String oeremark) {
		super();
		this.enqId = enqId;
		this.name = name;
		this.email = email;
		this.cid = cid;
		this.cibilscore = cibilscore;
		this.oeremark = oeremark;
	}


	public int getCibilscore() {
		return cibilscore;
	}

	public void setCibilscore(int cibilscore) {
		this.cibilscore = cibilscore;
	}
	public int getEnqId() {
		return enqId;
	}
	public void setEnqId(int enqId) {
		this.enqId = enqId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getOeremark() {
		return oeremark;
	}
	public void setOeremark(String oeremark) {
		this.oeremark = oeremark;
	}


}
