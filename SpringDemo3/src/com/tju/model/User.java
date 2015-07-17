package com.tju.model;

public class User {
	public String name;
	public String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public User()
	{
		
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + "]";
	}

	
}
