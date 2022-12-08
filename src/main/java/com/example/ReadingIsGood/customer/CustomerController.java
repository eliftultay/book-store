package com.example.ReadingIsGood.customer;

import com.example.ReadingIsGood.book.BookService;
import com.example.ReadingIsGood.book.model.BookRequest;
import com.example.ReadingIsGood.book.model.BookResponse;
import com.example.ReadingIsGood.customer.model.CustomerRequest;
import com.example.ReadingIsGood.customer.model.CustomerResponse;
import com.example.ReadingIsGood.shared.SuccessResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/customer")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    @ResponseBody
    private ResponseEntity<SuccessResponse> createNewCustomer(CustomerRequest customerRequest) {
        CustomerResponse customerResponse = customerService.createNewCustomer(customerRequest);
        SuccessResponse response = new SuccessResponse(customerResponse, "New customer created.");
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }


}