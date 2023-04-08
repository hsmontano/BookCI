package com.supreme.dev.code.bookci.services;

import com.supreme.dev.code.bookci.entities.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

public interface AuthorService {

    /**
     * get all entities
     *
     * @return list of entities list<Author>
     */
    List<Author> getAll();

    /**
     * create a new item for domain
     *
     * @param author
     * @return Author
     */
    Author create(Author author);

    /**
     * update entity, check before if existing data, if data is empty throw exception
     *
     * @param author
     * @return Author
     */
    Author update(Author author);

    /**
     * get Author by id, can be return empty
     *
     * @param id
     * @return Author
     */
    Author getOne(Long id);

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
     * @return Page<Author>
     */
    Page<Author> findAllPaginate(Pageable pageable);

    /**
     * find all with pageable by criteria
     * @param specs
     * @param pageable
     * @return Page<Author>
     */
    Page<Author> findAllSpecification(Specification<Author> specs, Pageable pageable);
}
