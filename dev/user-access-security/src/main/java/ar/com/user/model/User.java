package ar.com.user.model;

import org.hibernate.validator.constraints.NotEmpty;

public class User {

	@NotEmpty
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
