package com.shoutbook.AuthenticationService.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.shoutbook.AuthenticationService.model.User;

@RestController
public class UserController {

	@GetMapping("/users")
	@CrossOrigin(origins = "http://localhost:8080")
	public String getUsers() {
		Map<String,String> obj1 = new HashMap<String,String>();
		obj1.put("name", "Shubham Mangla");
		return new Gson().toJson(obj1);
	}
}
