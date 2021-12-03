 package com.neosoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.dto.MyDeotUserDetail;
import com.neosoft.dto.MyDepartMentBook;
import com.neosoft.entity.DepartMent;
import com.neosoft.service.DepartMentService;

@RestController
@RequestMapping("/department")
public class DepartMentController {

	@Autowired
	private DepartMentService service;

	@PostMapping("/")
	public DepartMent saveDepartMent(@RequestBody DepartMent dept) {
		return service.insert(dept);
	}
	
	
	@GetMapping("/{id}")
	public MyDeotUserDetail getUSerDetail(@PathVariable Integer id)
	{
		return service.findById(id);
	}
	
	@GetMapping("/find/{dpt}")
	public MyDepartMentBook getAllBooksDetails(@PathVariable String dpt) {
		
		
		return service.findAllBookDetailsBasedonDpt(dpt);
	}
	
	
}
