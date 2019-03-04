package com.shoutbook.AuthenticationService.service;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoutbook.AuthenticationService.model.User;
import com.shoutbook.AuthenticationService.repository.UserRepository;

@Service("userService")
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public List<User> getUsers(){
		Stream.of("Kentucky Brunch Brand Stout", "Good Morning", "Very Hazy", "King Julius",
                "Budweiser", "Coors Light", "PBR").forEach(name ->
                userRepository.save(new User(name)));
        
                return userRepository.findAll();
	}
}
