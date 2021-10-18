package com.cjc.app.fl.master.main.service;

import java.util.List;

import com.cjc.app.fl.master.main.exception.CustomerServiceException;
import com.cjc.app.fl.master.main.model.CustomerDetails;
import com.cjc.app.fl.master.main.model.CustomerEnquiry;
import com.cjc.app.fl.master.main.model.Documents;

public interface ReService {
	
	public void saveEnquiry(CustomerEnquiry ce);
	
	public List<CustomerEnquiry> getAllEnquiry();

	public void saveCustomerDetails(CustomerDetails cd);
	
	public void saveCustomerDocument(Documents d);
	
	public CustomerEnquiry getSingleEnquiry(int id) throws CustomerServiceException;
	

}
