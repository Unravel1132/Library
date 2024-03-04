package com.Library.Library.Service;


import com.Library.Library.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Library.Library.Entity.Book;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();

    }
    public Optional<Book> getBookId(Long id){
       return bookRepository.findById(id);
    }
    public Book saveBook(Book book){
        return bookRepository.save(book);


    }
    public void deleteBook(Long id){
        bookRepository.deleteById(id);
    }
}
