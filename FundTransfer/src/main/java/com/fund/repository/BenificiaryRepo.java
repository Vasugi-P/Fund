package com.fund.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fund.entity.Benificiary;


@Repository
public interface BenificiaryRepo extends JpaRepository<Benificiary, Long>{
	

}
