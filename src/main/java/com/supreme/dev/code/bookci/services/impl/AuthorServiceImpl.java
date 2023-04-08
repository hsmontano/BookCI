package com.supreme.dev.code.bookci.services.impl;

import com.supreme.dev.code.bookci.entities.Author;
import com.supreme.dev.code.bookci.services.AuthorService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {


    @Override
    public List<Author> getAll() {
        return null;
    }

    @Override
    public Author create(Author author) {
        return null;
    }

    @Override
    public Author update(Author author) {
        return null;
    }

    @Override
    public Author getOne(Long id) {
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
    public Page<Author> findAllPaginate(Pageable pageable) {
        return null;
    }

    @Override
    public Page<Author> findAllSpecification(Specification<Author> specs, Pageable pageable) {
        return null;
    }
}
