package com.example.Mongodb;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserService {

	public User saveUser(User user);

	public List<User> getUsers();

	public List<User>getUserById();

    public ResponseEntity<User> getUserById(Long id);

	public User updateUser(Long id, User user);

	public void deleteUser(Long id);
}

