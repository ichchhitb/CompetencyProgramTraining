package com.cybage.java.group1.dto;

import java.io.Serializable;


/**
 * The persistent class for the role database table.
 * 
 */
public class RoleDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private int roleId;

	private String roleName;

	public RoleDTO() {
		super();
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}