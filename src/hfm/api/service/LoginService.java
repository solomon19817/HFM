package hfm.api.service;

import hfm.api.model.User;

import java.util.List;

public interface LoginService {
	public boolean validateUser(String username, String password);
	public List<User> list_all_users();
}
