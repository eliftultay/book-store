package com.example.ReadingIsGood.customer.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class CustomerRequest {
    String firstName;
    String lastName;
    String address;
}