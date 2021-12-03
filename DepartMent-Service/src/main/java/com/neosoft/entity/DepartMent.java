package com.neosoft.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="dept_name")
public class DepartMent {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer deptId;
	private String depName;
	private String depAddress;
	private Integer uid;
}
