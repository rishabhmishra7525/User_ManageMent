package com.neosoft.dto;

import lombok.Data;

@Data
public class User {
	private Integer uid;
	private String userName;
	private String userAddress;
	private String country;
	private String email;
	private String language;
	private String mobile;
}
