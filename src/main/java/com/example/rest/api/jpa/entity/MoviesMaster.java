package com.example.rest.api.jpa.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="movies_master")
public class MoviesMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="movie_id")
	private long movieId;
	
	@Column(name="movie_name")
	private String movieName;
	
	@Column(name="movie_desc")
	private String movieDescription;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="rating_id")
	private MoviesRating movieRating;

	@OneToMany(mappedBy = "movieMaster")
	private Set<UserMovies> userMovies ;
	
	public MoviesMaster() {
		
	}


	/**
	 * @param movieName
	 * @param movieDescription
	 * @param movieRating
	 */
	public MoviesMaster(String movieName, String movieDescription, MoviesRating movieRating) {
		this.movieName = movieName;
		this.movieDescription = movieDescription;
		this.movieRating = movieRating;
	}


	public long getMovieId() {
		return movieId;
	}


	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public String getMovieDescription() {
		return movieDescription;
	}


	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}


	public MoviesRating getMovieRating() {
		return movieRating;
	}


	public void setMovieRating(MoviesRating movieRating) {
		this.movieRating = movieRating;
	}
	
	
}
