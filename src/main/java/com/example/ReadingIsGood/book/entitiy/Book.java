package com.example.ReadingIsGood.book.entitiy;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "BOOKSTORE", name = "BOOK")
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@Data
public class Book {

    @Id
    @Column(name = "ID")
    long id;

    @Column(name = "NAME")
    String name;

    @Column(name = "AUTHOR")
    String author;

    @Column(name = "STOCK")
    int stock;
}