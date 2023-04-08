package com.supreme.dev.code.bookci.dtos;

import com.supreme.dev.code.bookci.entities.Book;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Setter @Getter
@Builder
public class AuthorDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private Long id;
    private String firstname;
    private String lastname;
    private List<Book> bookList;
}
