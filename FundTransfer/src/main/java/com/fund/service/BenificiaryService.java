package com.fund.service;





import com.fund.entity.Benificiary;

public interface BenificiaryService {
	
	public void deleteBenificiary(Long benificiaryId);
	
	Benificiary getAllBenificiary(Long benificiaryId);
	
	Benificiary getAllBenificiaryByCustomerId(Long customerId);
	
	
	
	

}
