package com.cjc.app.fl.master.main.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cjc.app.fl.master.main.exception.CustomerServiceException;
import com.cjc.app.fl.master.main.model.CustomerDetails;
import com.cjc.app.fl.master.main.model.CustomerEnquiry;
import com.cjc.app.fl.master.main.model.Documents;
import com.cjc.app.fl.master.main.service.ReService;
import com.google.gson.Gson;


@CrossOrigin("*")
@RestController
public class ReController {

	@Autowired
	ReService rs;
	
//--------------------------------------------------------------To-save-enquiry-application---->
	
	@PostMapping("/saveEnquiry")
	public String saveEnquiry(@RequestBody CustomerEnquiry ce)
	{
		rs.saveEnquiry(ce);
		return "Enquiry Application Saved....!!!!!";
	}

//---------------------------------------------------------------To-get-all-enquires----------->
	
	@GetMapping("/getAllEnquiry")
	public List<CustomerEnquiry> getAllEnquiry()
	{
		List<CustomerEnquiry> list = rs.getAllEnquiry();
		return list;
	}
	
//----------------------------------------------------------------To-save-customer-details------>
	
	@PostMapping("/saveCustomerDetails")
	public String saveCustomerDetails(@RequestBody CustomerDetails cd)
	{
		rs.saveCustomerDetails(cd);
		return "Enquiry Application Saved....!!!!!";
	}
	
//-----------------------------------------------------------------to-save-customer-documents---->
	
	@RequestMapping(value = "/saveCustomerDocument", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String saveCustDoc(
								@RequestPart(required = true, value="pancard") MultipartFile pancard,
								@RequestPart(required = true, value="adharcard") MultipartFile adharcard,
								@RequestPart(required = true, value="incomeProof") MultipartFile incomeProof,
								@RequestPart(required = true, value="signature") MultipartFile signature,
								@RequestPart(required = true, value="addressProof") MultipartFile addressProof,
								@RequestPart(required = true, value="productQuotation") MultipartFile productQuotation,
								@RequestPart(required = true, value="photo") MultipartFile photo,
								@RequestPart(required = true, value="itrFile") MultipartFile itrFile,
								@RequestPart("customerData") String customerData      // "{ custid : 101 }"
								
			                 ) throws IOException
	{
		Documents doc = new Documents();
		doc.setPancard(pancard.getBytes());
		doc.setAdharcard(adharcard.getBytes());
		doc.setIncomeProof(incomeProof.getBytes());
		doc.setSignature(signature.getBytes());
		doc.setAddressProof(addressProof.getBytes());
		doc.setProductQuotation(productQuotation.getBytes());
		doc.setPhoto(photo.getBytes());
		doc.setItrFile(itrFile.getBytes());

		//--------------------------------------------
		Gson gson = new Gson();
		Documents doc1 = gson.fromJson(customerData, Documents.class);
		//--------------------------------------------
		
		doc.setCustid(doc1.getCustid());
		
		rs.saveCustomerDocument(doc);
		
		return "Document Saved..!!!!!";
	}
	
//--------------------------------------------------------------------------->
	
	@GetMapping("/getSingleEnquiry/{id}")
	public CustomerEnquiry getSingleEnquiry(@PathVariable("id") int id) throws CustomerServiceException
	{
		CustomerEnquiry ce = rs.getSingleEnquiry(id);
		return ce;
	}
	

	
}
