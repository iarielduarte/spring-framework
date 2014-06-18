package ar.com.user.model;

import org.hibernate.validator.constraints.NotEmpty;

public class Role {
	
	@NotEmpty
	private String roles;

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}
}
