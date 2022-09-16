package com.infy.customer.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customerinfo")
public class Customer {
	@Id
	@Column(name = "uniqueIdNumber")
	private Long uniqueIdNumber;
	@Column(name = "dateOfBirth")
	private Date dateOfBirth;
	@Column(name = "emailAddress")
	private String email;
	@Column(name = "firstName")
	private String firstName;
	@Column(name =  "lastName")
	private String lastName;
	@Column(name = "idType")
	private String idType;
	@Column(name = "customerAddress_addressId")
	private Integer customerAddress_addressId;
	@Column(name = "simId")
	private Integer simId;
	@Column(name = "state")
	private String state;
	public Long getUniqueIdNumber() {
		return uniqueIdNumber;
	}
	public void setUniqueIdNumber(Long uniqueIdNumber) {
		this.uniqueIdNumber = uniqueIdNumber;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
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
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public Integer getCustomerAddress_addressId() {
		return customerAddress_addressId;
	}
	public void setCustomerAddress_addressId(Integer customerAddress_addressId) {
		this.customerAddress_addressId = customerAddress_addressId;
	}
	public Integer getSimId() {
		return simId;
	}
	public void setSimId(Integer simId) {
		this.simId = simId;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
