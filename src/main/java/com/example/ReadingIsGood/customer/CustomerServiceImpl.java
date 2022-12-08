package com.example.ReadingIsGood.customer;

import com.example.ReadingIsGood.customer.entitiy.Customer;
import com.example.ReadingIsGood.customer.model.CustomerRequest;
import com.example.ReadingIsGood.customer.model.CustomerResponse;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    CustomerRepository customerRepository;

    @Override
    public CustomerResponse createNewCustomer(CustomerRequest customerRequest) {

        Customer customer = new Customer();
        customer.setFirstName(customerRequest.getFirstName());
        customer.setLastName(customerRequest.getLastName());
        customer.setAddress(customerRequest.getAddress());

        customerRepository.save(customer);

        CustomerResponse customerResponse = new CustomerResponse();
        customerResponse.setId(customer.getId());
        customerResponse.setFirstName(customer.getFirstName());
        customerResponse.setLastName(customer.getLastName());
        customerResponse.setAddress(customer.getAddress());

        return customerResponse;
    }

    /*@Override
    public CustomerResponse getAllOrdersOfCustomer() {
        return null;
    }*/
}