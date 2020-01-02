package com.luudd.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import io.swagger.annotations.Tag;

@Entity
@Table
public class User extends BaseEntity {
	
	@Id  
   	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int userId;
	@Column
	private String userName;
	@Column
	private int userRole;
	@Column
	private String userPassword;
	
	/*
	 * private List<Role> roles = new ArrayList<>();
	 * 
	 * public List<Role> getRoles() { return roles; }
	 * 
	 * @ManyToMany
	 * 
	 * @JoinTable(name = "role", joinColumns = @JoinColumn(name = "role_id"),
	 * inverseJoinColumns = @JoinColumn(name = "user_id") ) public void
	 * setRoles(List<Role> roles) { this.roles = roles; }
	 */
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserRole() {
		return userRole;
	}
	public void setUserRole(int userRole) {
		this.userRole = userRole;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getUserId() {
		return userId;
	}
	
	
}
