package com.pinku.spring.boot.swagger.api.service;

import com.pinku.spring.boot.swagger.api.dao.BookRepository;
import com.pinku.spring.boot.swagger.api.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public String saveBook(Book book){
        repository.save(book);
        return "book save dwith id " + book.getBookId();
    }

    public Book getBook(int bookId) {
            Book b = new Book();
            return b;
        // return repository.findById(bookId);
     //   return repository.findOne(bookId);
    }

    public List<Book> removeBook(int bookId) {
        List<Book> list = new ArrayList<>();
        return list;
       //return repository.delete(bookId);
       // return repository.findAll();
    }
}
