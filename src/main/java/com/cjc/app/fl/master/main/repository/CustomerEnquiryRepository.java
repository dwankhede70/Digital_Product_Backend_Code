package com.cjc.app.fl.master.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cjc.app.fl.master.main.model.CustomerEnquiry;
@Repository
public interface CustomerEnquiryRepository extends JpaRepository<CustomerEnquiry, Integer>{
	
	public CustomerEnquiry findByEnqId(int id);

}
