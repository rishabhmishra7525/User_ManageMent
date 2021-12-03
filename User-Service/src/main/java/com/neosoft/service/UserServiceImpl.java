package com.neosoft.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.entity.User;
import com.neosoft.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo repo;
	public User insert(User user) {
		return repo.save(user);
	}
	@Override
	public List<User> findUser() {
		return repo.findAll();
	}
	@Override
	public Optional<User> findByUserId(Integer id) {
		return repo.findById(id);
	}
	@Override
	public void deleteUser(Integer id) {
		repo.deleteById(id);
	}

}
