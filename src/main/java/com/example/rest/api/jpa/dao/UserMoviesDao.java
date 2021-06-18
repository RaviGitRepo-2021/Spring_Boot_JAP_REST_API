package com.example.rest.api.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest.api.jpa.entity.UserMovieId;
import com.example.rest.api.jpa.entity.UserMovies;

public interface UserMoviesDao extends JpaRepository<UserMovies, Long> {

}
