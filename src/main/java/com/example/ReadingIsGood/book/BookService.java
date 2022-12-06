package com.example.ReadingIsGood.book;

import com.example.ReadingIsGood.book.model.BookRequest;
import com.example.ReadingIsGood.book.model.BookResponse;

public interface BookService {

    BookResponse createNewBook(BookRequest bookRequest);

    void updateBookStock(BookRequest bookRequest);
}