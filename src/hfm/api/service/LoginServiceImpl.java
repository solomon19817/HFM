package hfm.api.service;

import javax.annotation.Resource;
import hfm.api.dao.UserDao;
import hfm.api.model.User;

import org.springframework.stereotype.Service;

@Service("loginServiceImpl")
public class LoginServiceImpl implements LoginService {
	@Resource(name = "userDao")
	private UserDao userDao;

	public LoginServiceImpl() {
		System.out.println("LoginServiceImpl initiated.");
	}

	public boolean validateUser() {
		System.out.println("validateUser");
		User user = new User();
		user.setUsername("Solomon");
		user.setPassword("sa");
		User result = this.userDao.getUser(user);
		if (result == null){
			return false;
		}else{
			return true;
		}
	}
}
