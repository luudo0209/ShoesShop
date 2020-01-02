package com.luudd.model.dto;

public class UserDTO {
	
	private int userId;
	private String userName;
	private int userRole;
	private String userPassword;
	
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDTO(int userId, String userName, int userRole, String userPassword) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userRole = userRole;
		this.userPassword = userPassword;
	}
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
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	
	
}
