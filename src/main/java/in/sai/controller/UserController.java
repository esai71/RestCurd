package in.sai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.sai.entity.UserDeatils;
import in.sai.service.UserService;

@RestController
public class UserController {
	@Autowired(required=true)
	UserService userService;
	
	@PostMapping("add/user")
	public ResponseEntity<String> addUserDetails(@RequestBody UserDeatils userDeatils){
		ResponseEntity<String> res=null;
	
		try {
	
		String body=userService.AddUser(userDeatils);
		res= new ResponseEntity<String>(body,HttpStatus.CREATED);
	     }
		catch(Exception e){
			
	
			String body="not Added";
			res= new ResponseEntity<String>(body,HttpStatus.INTERNAL_SERVER_ERROR);
			
		     }
		return res;
	
	}
}
		
		
		
		
		
		
		
		
		
	
	


