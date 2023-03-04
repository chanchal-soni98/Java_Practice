package com.masai.service;

import java.util.List;

import com.masai.model.Email;
import com.masai.model.User;

public interface UserService {

	  public List<User> getAllUser();
	  public User Addnewuser(User us);
	  public User getUserByid(Integer id);
	  public String removeUser(Integer id);
	  public Email getEmail(Integer id);
	  public String AddEmail(Integer userid, Email email);
}
