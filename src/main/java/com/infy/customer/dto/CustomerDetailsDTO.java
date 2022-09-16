package com.infy.customer.dto;

import java.sql.Date;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

public class CustomerDetailsDTO {
	@Pattern(regexp = "[A-z]*@[A-z]{1,}[.][a-z]{2,3}",message = "Invalid Mail/Mail cant be empty")
	@NotEmpty(message = "Email cant be empty")
	private String email;
	@NotNull(message = "DOB cant be null")
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	private Date dob;
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
}
