package com.fund.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name = "Benificiary")
public class Benificiary {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long benificiaryId;
	private Long accountNumber;
	private String benificiaryName;

	@ManyToOne
	private Customer customer;

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getBenificiaryName() {
		return benificiaryName;
	}

	public void setBenificiaryName(String benificiaryName) {
		this.benificiaryName = benificiaryName;
	}

	public Benificiary(Long accountNumber, String benificiaryName) {
		super();
		this.accountNumber = accountNumber;
		this.benificiaryName = benificiaryName;
	}

	public Benificiary() {
		super();
		// TODO Auto-generated constructor stub
	}

}
