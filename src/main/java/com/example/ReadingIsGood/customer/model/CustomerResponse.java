package com.example.ReadingIsGood.customer.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerResponse {
    long id;
    String firstName;
    String lastName;
    String address;
    //TODO List<Orders>
}