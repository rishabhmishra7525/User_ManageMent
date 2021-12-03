package com.neosoft.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.entity.DepartMent;

public interface DepartMentRepo extends JpaRepository<DepartMent, Integer> {

}
