package com.supreme.dev.code.bookci.services.impl;

import com.supreme.dev.code.bookci.entities.Book;
import com.supreme.dev.code.bookci.services.BookService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {


    @Override
    public List<Book> getAll() {
        return null;
    }

    @Override
    public Book create(Book book) {
        return null;
    }

    @Override
    public Book update(Book book) {
        return null;
    }

    @Override
    public Book getOne(Long id) {
        return null;
    }

    @Override
    public Long getTotal() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Page<Book> findAllPaginate(Pageable pageable) {
        return null;
    }

    @Override
    public Page<Book> findAllSpecification(Specification<Book> specs, Pageable pageable) {
        return null;
    }
}
