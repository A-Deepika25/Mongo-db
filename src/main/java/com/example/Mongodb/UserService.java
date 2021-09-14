package com.example.Mongodb;

import java.util.List;

public interface UserService {

	public User saveUser(User user);

	public List<User> getUsers();

	public Listitems<User>getUserById();

	public User updateUser(Long id, User user);

	public void deleteUser(Long id);
}

