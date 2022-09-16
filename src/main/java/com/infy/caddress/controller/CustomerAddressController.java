package com.infy.caddress.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.caddress.dto.AddressInputDTO;
import com.infy.caddress.entity.CustomerAddress;
import com.infy.caddress.service.CustomerAddressService;

@RestController
@RequestMapping("/address")
public class CustomerAddressController {
	
	@Autowired
	private CustomerAddressService addressService;
	
	@PostMapping("/update")
	public ResponseEntity<String> updateAddress(@RequestBody @Valid AddressInputDTO addrDetails){
		
		return addressService.updateDetails(addrDetails);
	}
	
	
	@GetMapping("/get/{addressId}")
	public CustomerAddress getCustomerAddress(@PathVariable("addressId") Integer adrsId) {
		return addressService.getAddressById(adrsId);
	}
}
