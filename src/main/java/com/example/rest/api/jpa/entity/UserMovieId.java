package com.example.rest.api.jpa.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class UserMovieId implements Serializable{
	
	@Column(name="user_id")
	private long userId;
	
	@Column(name="movie_id")
	private long movieId;
	/**
	 * @param userId
	 * @param movieId
	 */
	public UserMovieId(long userId, long movieId) {
		this.userId = userId;
		this.movieId = movieId;
	}
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public long getMovieId() {
		return movieId;
	}
	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}
	/**
	 * 
	 */
	public UserMovieId() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
