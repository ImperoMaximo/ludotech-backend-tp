package com.polytech.ludotech.mappers;

import com.polytech.ludotech.dto.BookDTO;
import com.polytech.ludotech.entity.BookEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {

    BookDTO toDTO(BookEntity bookEntity);

    BookEntity toEntity(BookDTO bookDTO);

    List<BookDTO> toDTO(List<BookEntity> bookEntities);
}
