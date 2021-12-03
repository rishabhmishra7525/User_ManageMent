package com.neosoft.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.neosoft.entity.User;

@Service
public interface UserService {

	User insert(User user);

	List<User> findUser();

	Optional<User> findByUserId(Integer id);

	void deleteUser(Integer id);


}
