package com.example.rest.api.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.api.jpa.entity.UserMovies;
import com.example.rest.api.jpa.services.UserMoviesService;

@RestController
public class UserMoviesController {
	@Autowired
	private UserMoviesService userMoviesService;
	
	@PostMapping("/user/movies")
	public ResponseEntity<String> saveUserMovies(@RequestBody UserMovies userMovies){
		boolean createStatus = userMoviesService.saveUserMovies(userMovies);
		if(createStatus) {
			return new ResponseEntity<String>("Successfully created", HttpStatus.OK);
		}
		return new ResponseEntity<String>("Successfully deleted", HttpStatus.BAD_REQUEST);
	}
}
