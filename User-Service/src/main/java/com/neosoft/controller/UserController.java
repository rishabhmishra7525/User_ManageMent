package com.neosoft.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.entity.User;
import com.neosoft.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/")
	public User saveUser(@RequestBody User user) {

		return service.insert(user);
	}
	
	@GetMapping("/")
	public List<User> getUser() {
		log.info("exicuting this method");
		return service.findUser();
	}
	@GetMapping("/{id}")
	public Optional<User> findUser(@PathVariable Integer id) {
		
		return service.findByUserId(id);
	}
	@DeleteMapping("delete/{id}")
	public  ResponseEntity<?> deleteUSer(@PathVariable Integer id) {
		
		service.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	

}
