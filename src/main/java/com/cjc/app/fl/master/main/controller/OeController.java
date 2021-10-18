package com.cjc.app.fl.master.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.fl.master.main.dto.OrderResponse;
import com.cjc.app.fl.master.main.model.Cibil;
import com.cjc.app.fl.master.main.model.CustomerEnquiry;
import com.cjc.app.fl.master.main.service.OeService;

@CrossOrigin("*")
@RestController
public class OeController {
	
	
	
	@Autowired
	OeService os;

	
	@PostMapping("/saveCibil/{id}")
	public String saveCibil(@RequestBody Cibil c,@PathVariable("id") int id)
	{
		System.out.println("inside save cibil-----------------");
		
		os.saveCibil(c,id);
		return "Cibil Saved..!!!!!!";
	}
//------------------------------------------------------------------------------------------->
	@GetMapping("/getCibilJoin")
	public List<OrderResponse> getjoin()
	{
		List<OrderResponse> list = os.getCibilJoin();
		return list;
	}
//---------------------------------------------------------------
	
	@Autowired
	private JavaMailSender emailSender;
	
	
	@GetMapping("/sendEmail/{toEmail}")
	public String sendEmail(@PathVariable("toEmail") String toEmail)
	{
		

		 SimpleMailMessage message = new SimpleMailMessage(); 
		 
	        message.setFrom("prathu.durge@gmail.com");        // sender mail address
	        message.setTo(toEmail);                           // reciver mail address
	        
	        message.setSubject("Vehicle Finance"); 
	        message.setText("You are eligible for loan service..");
	        
	        emailSender.send(message);
	        		
		
		return "Email Sent Successfully....!!!";
	}
	
}
