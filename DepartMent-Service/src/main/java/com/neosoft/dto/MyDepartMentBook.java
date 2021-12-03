package com.neosoft.dto;

import java.util.List;

import com.neosoft.entity.DepartMent;

import lombok.Data;

@Data
public class MyDepartMentBook {

	private List<DepartMent> dept;
	private List<Book> book;
}
