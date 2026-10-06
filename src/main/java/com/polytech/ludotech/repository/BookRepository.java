package com.polytech.ludotech.repository;

import com.polytech.ludotech.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, UUID> {

    BookEntity findByName(String name);
}
