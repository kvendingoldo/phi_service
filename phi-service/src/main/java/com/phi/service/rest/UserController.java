package com.phi.service.rest;

import com.phi.service.model.User;
import com.phi.service.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/index")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/user")
    public User getUserById(@RequestParam("userId") String userId) {
        return userRepository.findOne(userId);
    }

    @GetMapping("/user/new")
    public User createUser() {
        return userRepository.save(new User());
    }

    @PostMapping("/user")
    public void updateUser(@RequestBody User userToUpdate) {
        userRepository.save(userToUpdate);
    }

    @DeleteMapping("/user")
    public void dropUser(@RequestParam("userId") String userId) {
        userRepository.delete(userId);
    }

}
