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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="users_master")

public class UserMaster {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private long userID;
	
	@Column(length = 50, nullable = false,unique = true)
	private String email;
	
	@Column(length = 10,nullable = false)
	private String password;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="up_id")
	private UserProfile userProfile;
	
	@JsonIgnore
    @OneToMany(mappedBy = "userMaster", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<UserMovies> userMovies;
	
	/**
	 * @param email
	 * @param password
	*/
	public UserMaster(String email, String password) {
		this.email = email;
		this.password = password;
	}
	/**
	 * 
	 */
	public UserMaster() {
	}
	
	public long getUserID() {
		return userID;
	}
	public void setUserID(long userID) {
		this.userID = userID;
	}

	public UserProfile getUserProfile() {
		return userProfile;
	}
	public void setUserProfile(UserProfile userProfile) {
		this.userProfile = userProfile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<UserMovies> getUserMovies() {
		return userMovies;
	}
	public void setUserMovies(Set<UserMovies> userMovies) {
		this.userMovies = userMovies;
	}

}
