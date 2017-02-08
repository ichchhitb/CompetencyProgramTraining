package com.cybage.java.group1.dto;

import java.io.Serializable;
/**
 * The persistent class for the usertable database table.
 * 
 */
public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String userName;

	private byte active;
	
	private String dateOfCreation;

	private String name;

	private String password;

	private int roleId;

	public UserDTO() {
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public byte getActive() {
		return this.active;
	}

	public void setActive(byte active) {
		this.active = active;
	}


	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(String dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int hashCode() {
		return userName.hashCode() + password.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj!=null)
			return hashCode()==obj.hashCode();
		return false;
	}
}