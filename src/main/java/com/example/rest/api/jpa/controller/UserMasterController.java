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

import com.example.rest.api.jpa.entity.UserMaster;
import com.example.rest.api.jpa.services.UserMasterService;

@RestController
public class UserMasterController {
	
	@Autowired
	private UserMasterService userMasterService;
	
	
		@GetMapping("/users")
		public List<UserMaster> getUsers(){
			return userMasterService.getAllUsers();
		}
		
		@GetMapping("/users/{userId}")
		public UserMaster getUserByID(@PathVariable String userId) {
			return userMasterService.getUser(Long.parseLong(userId));
		}
		 
		@PostMapping("/users")
		public UserMaster createUser(@RequestBody UserMaster user) {
			return userMasterService.createUsers(user);
		}
		
		@PutMapping("/users")
		public ResponseEntity<String> updateUser(@RequestBody UserMaster user){
			
			boolean updateStatus=userMasterService.updateUser(user);
			if(updateStatus) {
				return new ResponseEntity<String>("Successfully updated", HttpStatus.OK);
			}else {
				return new ResponseEntity<String>("Failed", HttpStatus.BAD_REQUEST);
			}
		}
		
		@DeleteMapping("/users/{userId}")
		public ResponseEntity<String> deleteUser(@PathVariable String userId){
			
			boolean deleteStatus = userMasterService.deleteUser(Long.parseLong(userId));
			if(deleteStatus) {
				return new ResponseEntity<String>("Successfully deleted", HttpStatus.OK);
			}else {
				return new ResponseEntity<String>("Deletion Failed", HttpStatus.BAD_REQUEST);
			}
			
		}
		
}
