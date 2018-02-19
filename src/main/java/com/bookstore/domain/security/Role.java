package com.bookstore.domain.security;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Role implements Serializable {
	private static final long serialVersionUID=4345433L;
	@Id
	private int roleId;
	private String name;
	private Set<UserRole> userRoles = new HashSet<>();

	public Role() {

	}
	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<UserRole> getUserroles() {
		return userRoles;
	}

	public void setUserroles(Set<UserRole> userroles) {
		this.userRoles = userroles;
	}


}
