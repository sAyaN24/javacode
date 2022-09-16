package com.infy.customer.dto;

import javax.validation.constraints.Pattern;

public class PersonalDetailsDTO {
	@Pattern(regexp = "[A-z]{1,15}",message = "Firstname/Lastname should be maximum of 15 characters")
	private String firstName;
	@Pattern(regexp = "[A-z]{1,15}",message = "Firstname/Lastname should be maximum of 15 characters")
	private String lastName;
	@Pattern(regexp = "[A-z]*@[A-z]{1,}[.][a-z]{2,3}",message = "Email Not valid")
	private String email;
	public String getFirstName() {
		return firstName;
	}
	
	
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
