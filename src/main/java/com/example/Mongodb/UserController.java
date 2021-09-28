package com.example.Mongodb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Mongodb.User;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}

	@GetMapping("/list")
	public List<User> getUsers() {
		return userService.getUsers();
	}

	@GetMapping("/list/{user_id}")
    public ResponseEntity<User> getUserById(@PathVariable("user_id") Long id) {
        return userService.getUserById(id);
  }

	@PutMapping("/update/{user_id}")
	public User updateUser(@RequestBody User user, @PathVariable("user_id") Long id) {
		User usr=new User();
		usr.setId(user.getId());
		usr.setName(user.getName());
		usr.setAge(user.getAge());
		usr.setNum(user.getNum());
		return userService.updateUser(id, usr);
	}

	@DeleteMapping("/delete/{user_id}")
	public String deleteUser(@PathVariable("user_id") Long id) {
		userService.deleteUser(id);
		return id+"deleted succesfully ...";
	}

}
