package com.schoolspider.repositories;

import org.springframework.data.repository.CrudRepository;

import com.schoolspider.model.Terms;

public interface BooksRepository extends CrudRepository<Terms, String> {

}