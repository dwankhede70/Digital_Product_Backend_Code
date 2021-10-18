package com.cjc.app.fl.master.main.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.fl.master.main.dto.OrderResponse;
import com.cjc.app.fl.master.main.model.Cibil;
import com.cjc.app.fl.master.main.model.CustomerEnquiry;
import com.cjc.app.fl.master.main.repository.CibilRepository;
import com.cjc.app.fl.master.main.repository.CustomerEnquiryRepository;
import com.cjc.app.fl.master.main.service.OeService;

@Service
public class OeServiceImpl implements OeService{

	@Autowired
	CibilRepository cr;
	
	@Autowired
	CustomerEnquiryRepository cer;
	
	@Override                     
	public void saveCibil(Cibil c, int id) {
		
		Optional<CustomerEnquiry>  optional =  cer.findById(id);
		
		CustomerEnquiry custEnq1  =    optional.get();          //  Optional   >>>  CustomerEnquiry
		
		
		if(c.getOeremark().equals("Approved"))
		{	
			custEnq1.setCibilStatus("Approved");
			
			
			
			c.setEnqid(custEnq1);
			cr.save(c);
		}
		else
		{
			custEnq1.setCibilStatus("Rejected");
			c.setEnqid(custEnq1);
			cr.save(c);
		}
		        	
	}

	@Override
	public List<OrderResponse> getCibilJoin() {
		
		List<OrderResponse> list = cr.getCibilJoin();
		return list;
	}



}
