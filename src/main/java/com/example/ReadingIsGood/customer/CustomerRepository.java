package com.example.ReadingIsGood.customer;

import com.example.ReadingIsGood.customer.entitiy.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}