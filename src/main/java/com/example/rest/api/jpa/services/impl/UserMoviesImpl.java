package com.example.rest.api.jpa.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.api.jpa.dao.UserMoviesDao;
import com.example.rest.api.jpa.entity.UserMovies;
import com.example.rest.api.jpa.services.UserMoviesService;

@Service
public class UserMoviesImpl implements UserMoviesService {
	@Autowired	
	private UserMoviesDao userMovieDao;

	@Override
	public boolean saveUserMovies(UserMovies userMovie) {
		
		//System.out.println(userMovie.getMovieMaster().getMovieId());
		userMovieDao.save(userMovie);
		
		return true;
	}

}
