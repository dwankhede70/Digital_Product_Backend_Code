package com.cjc.app.fl.master.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cjc.app.fl.master.main.model.CustomerDetails;
@Repository
public interface CustomerDetailsRepository extends JpaRepository<CustomerDetails, Integer>{
	
	
	


}
