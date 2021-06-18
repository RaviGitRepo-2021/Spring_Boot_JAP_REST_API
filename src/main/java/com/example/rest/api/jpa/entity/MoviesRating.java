package com.example.rest.api.jpa.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movies_rating")
public class MoviesRating {
	@Id
	@Column(name="rating_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ratingId;
	
	@Column(name="movie_rating")
	private short movieRating;
	
	public MoviesRating() {
	}
	/**
	 * @param movieRating
	 */
	public MoviesRating(short movieRating) {
		this.movieRating = movieRating;
	}
	public long getRatingId() {
		return ratingId;
	}
	public void setMovieId(long movieId) {
		this.ratingId = movieId;
	}
	public short getMovieRating() {
		return movieRating;
	}
	public void setMovieRating(short movieRating) {
		this.movieRating = movieRating;
	}
	@Override
	public String toString() {
		return "MoviesRating [movieId=" + ratingId + ", movieRating=" + movieRating + "]";
	}
	
	
}
