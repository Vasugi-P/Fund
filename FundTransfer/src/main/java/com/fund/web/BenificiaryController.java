package com.fund.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fund.entity.Benificiary;
import com.fund.service.BenificiaryService;

@RestController
public class BenificiaryController {
	
	@Autowired
	private BenificiaryService bs;
	
	
	@DeleteMapping(path="delete/{benificiaryId}")
	public ResponseEntity<Void>deleteBenificiary(@PathVariable(name="benificiaryId")Long benificiaryId){
		bs.deleteBenificiary(benificiaryId);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	@GetMapping(path="benificiary/{benificiaryId}")
	public ResponseEntity<Benificiary>getAllBenificiary(@PathVariable(name="benificiaryId")Long benificiaryId){
		Benificiary benificiary=bs.getAllBenificiary(benificiaryId);
		return new ResponseEntity<Benificiary>(benificiary,HttpStatus.OK);
	}
	
	@GetMapping(path="benificiary/{customerId}")
	public ResponseEntity<Benificiary>getBenificiaryByCustomerId(@PathVariable(name="customerId")Long customerId){
		Benificiary benificiary=bs.getAllBenificiaryByCustomerId(customerId);
		return new ResponseEntity<Benificiary>(benificiary,HttpStatus.OK);
	}
	

}
