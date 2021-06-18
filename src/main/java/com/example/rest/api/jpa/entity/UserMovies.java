package com.example.rest.api.jpa.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="user_movies")
public class UserMovies implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserMaster userMaster;

	
	@ManyToOne
	@JoinColumn(name="movie_id")
	private MoviesMaster movieMaster;
	
	@Column(name="last_watch_time",columnDefinition="timestamp default current_timestamp")
	private Date lastWatchTime;

	public UserMaster getUserMaster() {
		return userMaster;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setUserMaster(UserMaster userMaster) {
		this.userMaster = userMaster;
	}

	public MoviesMaster getMovieMaster() {
		return movieMaster;
	}

	public void setMovieMaster(MoviesMaster movieMaster) {
		this.movieMaster = movieMaster;
	}

	public Date getLastWatchTime() {
		return lastWatchTime;
	}

	public void setLastWatchTime(Date lastWatchTime) {
		this.lastWatchTime = lastWatchTime;
	}

	public UserMovies() {
		super();
	}
}
