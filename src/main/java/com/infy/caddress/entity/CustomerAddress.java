package com.infy.caddress.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "addressinfo")
public class CustomerAddress {
	@Id
	@Column(name = "addressId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addressId;
	@Column(name = "address")
	private String address;
	@Column(name = "city")
	private String city;
	@Column(name = "pincode")
	private Integer pincode;
	@Column(name = "state")
	private String state;
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
