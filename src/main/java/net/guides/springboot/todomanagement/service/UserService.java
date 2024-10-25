package net.guides.springboot.todomanagement.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import net.guides.springboot.todomanagement.model.User;

public interface UserService {
	List<User> getAllUsers();
	Optional<User> getUserById(int userId);
	User getUserByUsername(String username);
	void updateUser(User user);
	void addUser(String name, String desc, Date targetDate, boolean isDone);
	void deleteUser(int id);
	void saveUser(User user);
}
