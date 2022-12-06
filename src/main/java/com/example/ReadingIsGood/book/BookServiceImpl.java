package com.example.ReadingIsGood.book;

import com.example.ReadingIsGood.book.entitiy.Book;
import com.example.ReadingIsGood.book.model.BookRequest;
import com.example.ReadingIsGood.book.model.BookResponse;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Service
public class BookServiceImpl implements BookService {

    BookRepository bookRepository;

    @Override
    public BookResponse createNewBook(BookRequest bookRequest) {
        Book book = new Book();
        book.setName(bookRequest.getName());
        book.setAuthor(bookRequest.getAuthor());
        book.setStock(book.getStock());

        bookRepository.save(book);

        BookResponse bookResponse = new BookResponse();
        bookResponse.setId(book.getId());
        bookResponse.setName(book.getName());
        bookResponse.setAuthor(book.getAuthor());
        bookResponse.setStock(book.getStock());

        return bookResponse;
    }

    @Override
    public void updateBookStock(BookRequest bookRequest) {

    }
}