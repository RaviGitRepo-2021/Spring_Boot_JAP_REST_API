package com.example.rest.api.jpa.services;
import java.util.List;

import com.example.rest.api.jpa.entity.UserMaster;
/**
 * @author ravi
 *
 */
public interface UserMasterService {
	public List<UserMaster> getAllUsers();
	public UserMaster getUser(long id);
	public UserMaster createUsers(UserMaster user);
	public boolean deleteUser(long id);
	public boolean updateUser(UserMaster user);
}
