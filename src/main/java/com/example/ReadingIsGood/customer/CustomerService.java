package com.example.ReadingIsGood.customer;

import com.example.ReadingIsGood.customer.model.CustomerRequest;
import com.example.ReadingIsGood.customer.model.CustomerResponse;

public interface CustomerService {
    CustomerResponse createNewCustomer(CustomerRequest customerRequest);

    //List<OrderResponse> getAllOrdersOfCustomer();
}