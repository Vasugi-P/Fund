package com.fund.service;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fund.entity.Benificiary;
import com.fund.exception.BenificiaryNotFoundException;
import com.fund.repository.BenificiaryRepo;

@Service
@Transactional
public class BenificiaryServiceImpl implements BenificiaryService {

	@Autowired
	private BenificiaryRepo beneRepo;

	@Override
	public void deleteBenificiary(Long benificiaryId) {
		beneRepo.deleteById(benificiaryId);

	}

	@Override
	public Benificiary getAllBenificiary(Long benificiaryId) {
		Benificiary benificiary = beneRepo.findById(benificiaryId).orElseThrow(BenificiaryNotFoundException::new);
		return benificiary;
	}

	@Override
	public Benificiary getAllBenificiaryByCustomerId(Long customerId) {
		Benificiary benificiary = beneRepo.findById(customerId).orElseThrow(BenificiaryNotFoundException::new);
		return benificiary;
	}

}
