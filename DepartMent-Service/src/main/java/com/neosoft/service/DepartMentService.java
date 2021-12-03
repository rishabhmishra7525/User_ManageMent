package com.neosoft.service;

import org.springframework.stereotype.Service;

import com.neosoft.dto.MyDeotUserDetail;
import com.neosoft.dto.MyDepartMentBook;
import com.neosoft.entity.DepartMent;

@Service
public interface DepartMentService {

	DepartMent insert(DepartMent dept);

	MyDeotUserDetail findById(Integer id);

	MyDepartMentBook findAllBookDetailsBasedonDpt(String dpt);

	



}
