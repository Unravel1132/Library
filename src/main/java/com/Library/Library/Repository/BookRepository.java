package com.Library.Library.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Library.Library.Entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
