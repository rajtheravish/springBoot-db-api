package com.ravish.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ravish.model.request.UserDetailsRequestModel;

@RestController
@RequestMapping("api")
public class Controller {

	@GetMapping
	public String getUser() {
		return "Get user was called";
	}
	
	@PostMapping
	public String createUser(@RequestBody UserDetailsRequestModel userDetails) {
		return "Create user was called";
	}
	
	@PutMapping
	public String updateUser() {
		return "Update uesr was called";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "Delete user was called";
	}
}
