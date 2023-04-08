package com.supreme.dev.code.bookci.services;

import com.supreme.dev.code.bookci.entities.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface BookService {

    /**
     * get all entities
     *
     * @return list of entities List<Book>
     */
    List<Book> getAll();

    /**
     * create a new item for domain
     *
     * @param book
     * @return Book
     */
    Book create(Book book);

    /**
     * update entity, check before if existing data, if data is empty throw exception
     *
     * @param book
     * @return Book
     */
    Book update(Book book);

    /**
     * get Book by id, can be return empty
     *
     * @param id
     * @return Book
     */
    Book getOne(Long id);

    /**
     * count item in entity
     *
     * @return Long
     */
    Long getTotal();

    /**
     * delete record by id
     *
     * @param id
     */
    void delete(Long id);

    /**
     * find all with pageable
     *
     * @param pageable
     * @return Page<Book>
     */
    Page<Book> findAllPaginate(Pageable pageable);

    /**
     * find all with pageable by criteria
     *
     * @param specs
     * @param pageable
     * @return Page<Book>
     */
    Page<Book> findAllSpecification(Specification<Book> specs, Pageable pageable);
}
