package com.test.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.test.Entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book,Integer>{
	public Book findById(int id);
}
