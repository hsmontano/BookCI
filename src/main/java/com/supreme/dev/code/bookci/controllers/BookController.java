package com.supreme.dev.code.bookci.controllers;

import com.supreme.dev.code.bookci.entities.Book;
import com.supreme.dev.code.bookci.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final Logger log = LoggerFactory.getLogger(BookController.class);
    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    /**
     *
     * @return list of books entities
     */
    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks(){
        log.debug("REST request to get all books");
        List<Book> bookList = bookService.getAll();
        return new ResponseEntity<>(bookList, HttpStatus.OK);
    }
}
