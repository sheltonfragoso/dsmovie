package com.sheltonfragoso.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sheltonfragoso.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
