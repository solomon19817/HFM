package hfm.api.service;

import java.util.List;

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

	public boolean validateUser(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		User result = this.userDao.getUser(user);
		if (result == null){
			return false;
		}else{
			return true;
		}
	}
	
	public List<User> list_all_users() {
		return this.userDao.get_all_users();
	}
}
