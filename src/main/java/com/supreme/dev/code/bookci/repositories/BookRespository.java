package com.supreme.dev.code.bookci.repositories;

import com.supreme.dev.code.bookci.entities.Author;
import com.supreme.dev.code.bookci.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRespository extends JpaRepository<Book, Long>, JpaSpecificationExecutor<Book> {
}
