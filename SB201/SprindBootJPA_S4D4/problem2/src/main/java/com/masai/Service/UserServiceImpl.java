package com.masai.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Repo.EmailRepository;
import com.masai.Repo.UserRepository;
import com.masai.model.Email;
import com.masai.model.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userrepo;
	
	@Autowired
	private EmailRepository mailrepo;

	@Override
	public List<User> getAllUser() {
		
		
		return userrepo.findAll();
	}

	@Override
	public User Addnewuser(User us) {
		
		// assigning each other
		if(us.getEmail()!=null) {
			us.getEmail().setUser(us);
			
		//	mailrepo.save(us.getEmail());
		}
		
		  return userrepo.save(us);
	}

	@Override
	public User getUserByid(Integer id) {
		return userrepo.findById(id).get();
	}

	@Override
	public String removeUser(Integer id) {
		User us=userrepo.findById(id).get();
		
		userrepo.delete(us);
		return "Deleted";
	}

	@Override
	public Email getEmail(Integer id){
		
		return userrepo.findById(id).get().getEmail();
	}

	@Override
	public String AddEmail(Integer userid, Email email) {
		User us=userrepo.findById(userid).get();
		
		us.setEmail(email);
		email.setUser(us);
		
		userrepo.save(us);
		
		return "Added";
	}

}
