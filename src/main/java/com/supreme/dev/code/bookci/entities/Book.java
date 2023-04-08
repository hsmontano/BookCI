package com.supreme.dev.code.bookci.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter @Getter
@Entity
@Table(name = "book", schema = "public")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "isbn", unique = true)
    private String isbn;
    @Column(name = "description")
    private String description;
    @Column(name = "pages")
    private Integer pages;
    @Column(name = "price")
    private Float price;
}
