package com.supreme.dev.code.bookci.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.io.Serial;
import java.io.Serializable;

@Setter @Getter
@Builder
public class BookDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    private Long id;
    private String title;
    private String isbn;
    private String description;
    private Integer pages;
    private Float price;
    private String authorFirstname;
}
