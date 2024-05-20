package com.pinku.spring.boot.swagger.api.dao;

import com.pinku.spring.boot.swagger.api.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Integer> {


}
