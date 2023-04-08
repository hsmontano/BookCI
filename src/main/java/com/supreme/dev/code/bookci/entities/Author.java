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
@Table(name = "author", schema = "public")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "firstname", nullable = false, length = 150)
    private String firstname;
    @Column(name = "lastname", nullable = false, length = 150)
    private String lastname;
}
