package com.ltts.demoSpring1.Dao;

import org.springframework.data.repository.CrudRepository;

import com.ltts.demoSpring1.model.Movie;

public interface MovieDao extends CrudRepository<Movie, Integer> {
	
}
