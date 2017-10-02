package com.schoolspider.repositories;

import org.springframework.data.repository.CrudRepository;

import com.schoolspider.model.Apps;

public interface AppRepository extends CrudRepository<Apps, Integer> {

}