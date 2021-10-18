package com.cjc.app.fl.master.main.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cjc.app.fl.master.main.dto.OrderResponse;
import com.cjc.app.fl.master.main.model.Cibil;



@Repository
public interface CibilRepository extends JpaRepository<Cibil, Integer>{
	

	
	
	@Query("SELECT new com.cjc.app.fl.master.main.dto.OrderResponse(enq.enqId, enq.name, enq.email, c.cid, c.cibilscore, c.oeremark) FROM Cibil c INNER JOIN c.enqid enq where c.oeremark='Approved'  ")
	public List<OrderResponse> getCibilJoin();

}
//   SELECT new com.cjc.app.fl.master.main.dto.OrderResponse(enq.enqId, enq.name, enq.email, c.cid, c.cibilscore, c.oeremark) 
//   FROM Cibil c INNER JOIN c.enqid enq where c.oeremark='Approved'