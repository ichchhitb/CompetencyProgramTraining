package com.cybage.java.group1.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the role database table.
 * 
 */
@Entity
@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int roleId;

	private String roleName;

	//bi-directional many-to-one association to User
	@OneToMany(mappedBy="role")
	private List<User> usertables;

	public Role() {
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

	public List<User> getUsertables() {
		return this.usertables;
	}

	public void setUsertables(List<User> usertables) {
		this.usertables = usertables;
	}

	public User addUsertable(User usertable) {
		getUsertables().add(usertable);
		usertable.setRole(this);

		return usertable;
	}

	public User removeUsertable(User usertable) {
		getUsertables().remove(usertable);
		usertable.setRole(null);

		return usertable;
	}

}