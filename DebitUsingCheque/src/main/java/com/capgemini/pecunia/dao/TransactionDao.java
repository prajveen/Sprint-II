package com.capgemini.pecunia.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.capgemini.pecunia.entity.Account;

public interface TransactionDao extends JpaRepository<Account, String> {

	@Query("select f from Account f  where accountID =?1")
	Account getAccountbyID(String accountID);
	

	
}
