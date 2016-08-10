package hfm.api.dao;

import org.springframework.stereotype.Repository;

import hfm.api.model.User;
@Repository("userDao")
public interface UserDao {
    public User getUser(User user);
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUser(int UserId);
}
