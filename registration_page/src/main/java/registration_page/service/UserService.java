package registration_page.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import registration_page.Model.User;
import registration_page.dao.UserDao;

@Service
public class UserService {
	
	
	@Autowired
	private UserDao userDao;
	
	
	public int createUser(User user) {
		return this.userDao.saveUser(user);
		
	}
	

}
