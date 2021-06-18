package com.example.rest.api.jpa.services;
import java.util.List;

import com.example.rest.api.jpa.entity.MoviesMaster;

public interface MoviesMasterService {
	public List<MoviesMaster> getAllMovies();
	public MoviesMaster saveMovie(MoviesMaster movie);
	public MoviesMaster getMovie(long id);
	public boolean updateMovie(MoviesMaster moviesMaster);
	public boolean deleteMovie(long id);
}
