package com.example.ReadingIsGood.book.model;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class BookRequest {
    String name;
    String author;
    int stock;
}