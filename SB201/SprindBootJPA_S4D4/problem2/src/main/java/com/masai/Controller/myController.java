package com.masai.Controller;

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

import com.masai.Service.UserService;
import com.masai.model.Email;
import com.masai.model.User;

@RestController
public class myController {
	@Autowired
	private UserService uservice;

	@GetMapping("/users")
	public ResponseEntity<List<User>> getAlluser() {
		
		  List<User> lis=uservice.getAllUser();
		  
		  return new ResponseEntity<List<User>>(lis,HttpStatus.OK);
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUByidHandler(@PathVariable("id") Integer id) {
		
		  User us=uservice.getUserByid(id);
		  
		  return new ResponseEntity<User>(us,HttpStatus.OK);
	}
	
	@PostMapping("/users")
	public ResponseEntity<User> adduserHandler(@RequestBody User us){
		
		    User u=uservice.Addnewuser(us);
		    return new ResponseEntity<User>(us,HttpStatus.OK);
	}
	   
	@DeleteMapping("users/{id}")
	public ResponseEntity<String> removeUserHandler(@PathVariable("id") Integer id){
		   
		String sp=uservice.removeUser(id);
		return new ResponseEntity<String>(sp,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/useremail/{id}")
	public ResponseEntity<Email> getMailByuid(@PathVariable("id") Integer id) {
		
		Email e=uservice.getEmail(id);
		return new ResponseEntity<>(e,HttpStatus.OK);
	}
	
	@PutMapping("/users/{id}")
	public ResponseEntity<String> addemailByuser(@PathVariable("id") Integer id,@RequestBody Email email){
		
		    String str= uservice.AddEmail(id, email);
		    
		    return new ResponseEntity<String>(str,HttpStatus.OK);
	}
}
