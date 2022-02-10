package in.sai.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sai.entity.UserDeatils;
import in.sai.repository.UserRepository;
import in.sai.service.UserService;
@Service
public class UserServiceImpl implements UserService {
  
	@Autowired
	UserRepository userRepository;
	
	@Override
	public String AddUser(UserDeatils userDetails) {
		// TODO Auto-generated method stub
		userRepository.save(userDetails);
		return "User Added Successfully";
	}

}
