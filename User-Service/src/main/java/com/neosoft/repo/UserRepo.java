package com.neosoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
