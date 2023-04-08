package com.supreme.dev.code.bookci.converters;

import com.supreme.dev.code.bookci.dtos.BookDTO;
import com.supreme.dev.code.bookci.entities.Book;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BookConverter {

    private final ModelMapper modelMapper;

    public BookDTO bookToDto(Book book){
        return modelMapper.map(book, BookDTO.class);
    }
}
