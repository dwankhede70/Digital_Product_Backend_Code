package com.cjc.app.fl.master.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.fl.master.main.exception.CustomerServiceException;
import com.cjc.app.fl.master.main.model.CustomerDetails;
import com.cjc.app.fl.master.main.model.CustomerEnquiry;
import com.cjc.app.fl.master.main.model.Documents;
import com.cjc.app.fl.master.main.repository.CustomerDetailsRepository;
import com.cjc.app.fl.master.main.repository.CustomerEnquiryRepository;
import com.cjc.app.fl.master.main.repository.DocumentsRepository;
import com.cjc.app.fl.master.main.service.ReService;

@Service
public class ReServiceImpl implements ReService {

	@Autowired
	CustomerEnquiryRepository cer;
	
	@Autowired
	CustomerDetailsRepository cdr;
	
	@Autowired
	DocumentsRepository dr;
	
//--------------------------------------------------------------To-save-enquiry-application---->
	
	@Override
	public void saveEnquiry(CustomerEnquiry ce) {
		
		cer.save(ce);
		
	}
//---------------------------------------------------------------To-get-all-enquires----------->
	@Override
	public List<CustomerEnquiry> getAllEnquiry() {
		
		List<CustomerEnquiry> list = cer.findAll();
		return list;
	}
//--------------------------------------------------------------------------------------->
	@Override
	public void saveCustomerDetails(CustomerDetails cd) {
		
		cdr.save(cd);
		
	}
//------------------------------------------------------------------------------------->
	@Override
	public void saveCustomerDocument(Documents d) {
		
		dr.save(d);
//------------------------------------------------------------------------------------->		
	}
	@Override
	public CustomerEnquiry getSingleEnquiry(int id) throws CustomerServiceException{
		
		CustomerEnquiry c;
			
			
			try 
			{
				Optional<CustomerEnquiry> o = cer.findById(id);
				c = o.get();
			}
			
			catch (Exception e) 
			{
				throw new CustomerServiceException("Data not found.........!!!");
			}
			
		
		return c;
		
	}



}
