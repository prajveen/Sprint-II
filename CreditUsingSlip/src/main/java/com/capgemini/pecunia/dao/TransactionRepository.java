package com.capgemini.pecunia.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.pecunia.entity.SlipTransactions;

@Repository
public interface TransactionRepository extends JpaRepository<SlipTransactions, String> {


}
