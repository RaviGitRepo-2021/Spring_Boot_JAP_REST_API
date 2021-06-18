package com.example.rest.api.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.api.jpa.entity.MoviesMaster;
import com.example.rest.api.jpa.services.MoviesMasterService;

@RestController
public class MoviesMasterController {
	
	@Autowired
	private MoviesMasterService moviesMasterService;
	
	
	@PostMapping("/movies")
	public MoviesMaster saveMovie(@RequestBody MoviesMaster movie) {
		System.out.println("************"+movie);
		return moviesMasterService.saveMovie(movie);
		
	}
	@GetMapping("/movies/{id}")
	public MoviesMaster getMovie(@PathVariable String id) {
		return moviesMasterService.getMovie(Long.parseLong(id));
	}
	@GetMapping("/movies")
	public List<MoviesMaster> getMovies() {
		return moviesMasterService.getAllMovies();
	}
	
	@DeleteMapping("/movies/{id}")
	public ResponseEntity<String> deleteMovie(@PathVariable String id){
		boolean deleteStatus=moviesMasterService.deleteMovie(Long.parseLong(id));
			if(deleteStatus) {
				return new ResponseEntity<String>("Successfully Deleted", HttpStatus.OK);
			}
			return new ResponseEntity<String>("Deletion Failed", HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping("/movies")
	public ResponseEntity<String> updateMovie(@RequestBody MoviesMaster movie){
		boolean updateStatus=moviesMasterService.updateMovie(movie);
			if(updateStatus) {
				return new ResponseEntity<String>("Successfully Updated", HttpStatus.OK);
			}
			return new ResponseEntity<String>("Updation Failed", HttpStatus.BAD_REQUEST);
	}
}
