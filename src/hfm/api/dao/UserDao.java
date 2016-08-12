package hfm.api.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import hfm.api.model.User;
@Repository("userDao")
public interface UserDao {
	public List<User> get_all_users();
    public User getUser(User user);
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(int UserId);
}
