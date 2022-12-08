package com.example.ReadingIsGood.book;

import com.example.ReadingIsGood.book.model.BookRequest;
import com.example.ReadingIsGood.book.model.BookResponse;
import com.example.ReadingIsGood.shared.SuccessResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping
    @ResponseBody
    private ResponseEntity<SuccessResponse> createNewBook(BookRequest bookRequest) {
        BookResponse bookResponse = bookService.createNewBook(bookRequest);
        SuccessResponse response = new SuccessResponse(bookResponse, "New book created.");
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    //TODO implement request method for updating book stock

}