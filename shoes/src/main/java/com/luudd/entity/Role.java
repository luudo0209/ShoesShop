package com.luudd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Role extends BaseEntity{
	
	@Id  
   	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int roleId;
	
	@Column
	private int roleName;
}
