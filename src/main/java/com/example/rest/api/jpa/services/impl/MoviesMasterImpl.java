package com.example.rest.api.jpa.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.api.jpa.dao.MoviesMasterDao;
import com.example.rest.api.jpa.entity.MoviesMaster;
import com.example.rest.api.jpa.services.MoviesMasterService;

@Service
public class MoviesMasterImpl implements MoviesMasterService {

	@Autowired
	MoviesMasterDao moviesMasterDao;
	
	@Override
	public List<MoviesMaster> getAllMovies() {
		return moviesMasterDao.findAll();
	}

	@Override
	public MoviesMaster saveMovie(MoviesMaster movie) {
		System.out.println("impl");
		moviesMasterDao.save(movie);
		return movie;
	}

	@Override
	public MoviesMaster getMovie(long id) {
		return moviesMasterDao.findById(id).get();
	}

	@Override
	public boolean updateMovie(MoviesMaster moviesMaster) {
		boolean existStatus= moviesMasterDao.existsById(moviesMaster.getMovieId());
		if(existStatus) {
			moviesMasterDao.save(moviesMaster);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteMovie(long id) {
		boolean existStatus= moviesMasterDao.existsById(id);
		if(existStatus) {
			moviesMasterDao.deleteById(id);
			return true;
		}
		return false;
	}

}
