package com.example.rest.api.jpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.rest.api.jpa.entity.MoviesMaster;

public interface MoviesMasterDao extends JpaRepository<MoviesMaster, Long> {

}
