package com.example.rest.api.jpa.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rest.api.jpa.dao.UserMasterDao;
import com.example.rest.api.jpa.entity.UserMaster;
import com.example.rest.api.jpa.services.UserMasterService;

@Service
public class UserMasterImpl implements UserMasterService {


	/**
	 * Creating instance of UserMasterDAO
	 */
	@Autowired
	private UserMasterDao userMasterDao;

	@Override
	public List<UserMaster> getAllUsers() {
		return userMasterDao.findAll();
	}

	@Override
	public UserMaster getUser(long id) {
		//return userMasterDao.getOne(id);
		return userMasterDao.findById(id).get();
	}

	@Override
	public UserMaster createUsers(UserMaster user) {
		boolean existStatus = userMasterDao.existsById(user.getUserID());
		if(!existStatus) {
			userMasterDao.save(user);
		}
		return user;
	}

	@Override
	public boolean deleteUser(long id) {
		boolean existStatus = userMasterDao.existsById(id);
		if(existStatus) {
			userMasterDao.deleteById(id);
		}else {
			return false;
		}
	return true;
		
	}

	@Override
	public boolean updateUser(UserMaster user) {

		Optional<UserMaster> existUser= userMasterDao.findById(user.getUserID());
		if(!existUser.isEmpty()) {
			userMasterDao.save(user);
			return true;
		}else {
			return false;
		}
		
	}
	
}
