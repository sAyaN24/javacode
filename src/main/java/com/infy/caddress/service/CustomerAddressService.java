package com.infy.caddress.service;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.infy.caddress.dto.AddressInputDTO;
import com.infy.caddress.entity.CustomerAddress;
import com.infy.caddress.repository.CustomerAddressRepository;

@Service
public class CustomerAddressService {
	@Autowired
	private CustomerAddressRepository addressRepository;

	public ResponseEntity<String> updateDetails(@Valid AddressInputDTO addrDetails) {
		CustomerAddress newAddress = new CustomerAddress();
		newAddress.setAddress(addrDetails.getAddress());
		newAddress.setCity(addrDetails.getCity());
		newAddress.setPincode(addrDetails.getPincode());
		newAddress.setState(addrDetails.getState());
		
		addressRepository.save(newAddress);
		
		return new ResponseEntity<>("Update Success !!",HttpStatus.OK);
	}

	public CustomerAddress getAddressById(Integer adrsId) {
		Optional<CustomerAddress> result = addressRepository.findById(adrsId);
		if(result.isPresent())
			return result.get();
		return new CustomerAddress();
	}
	
	
}
