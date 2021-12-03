package com.neosoft.dto;

import com.neosoft.entity.DepartMent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyDeotUserDetail {

	private DepartMent department;
	private User user;
}
