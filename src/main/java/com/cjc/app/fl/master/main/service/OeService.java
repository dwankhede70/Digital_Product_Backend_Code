package com.cjc.app.fl.master.main.service;

import java.util.List;

import com.cjc.app.fl.master.main.dto.OrderResponse;
import com.cjc.app.fl.master.main.model.Cibil;

public interface OeService {
	
	public void saveCibil(Cibil c, int id);
	
	public List<OrderResponse> getCibilJoin();
	
	

}
