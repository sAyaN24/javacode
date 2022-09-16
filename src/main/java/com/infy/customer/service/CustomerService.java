package com.infy.customer.service;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.infy.customer.controller.AddressFeign;
import com.infy.customer.controller.PlanFeign;
import com.infy.customer.controller.SimFeign;
import com.infy.customer.dto.AddressDTO;
import com.infy.customer.dto.CustomerDetailsDTO;
import com.infy.customer.dto.PersonalDetailsDTO;
import com.infy.customer.dto.PlanDTO;
import com.infy.customer.dto.SimInfoDTO;
import com.infy.customer.entity.Customer;
import com.infy.customer.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerIdentityRepository;
	
	@Autowired
	private AddressFeign addressFeign;
	@Autowired
	private SimFeign simFeign;
	@Autowired
	private PlanFeign planFeign;
	
	public ResponseEntity<Object> validateDetails(PersonalDetailsDTO custDetails) {
		Optional<Customer> result =  customerIdentityRepository.findByFirstNameAndLastNameAndEmail(custDetails.getFirstName(),custDetails.getLastName(),custDetails.getEmail());
		if(result.isPresent()) {
			return new ResponseEntity<>(result.get(),HttpStatus.OK);
		}
		return new ResponseEntity<>("Invalid details",HttpStatus.CONFLICT);
	}

	public ResponseEntity<Object> activateSim(@Valid CustomerDetailsDTO custDetails) {
		Optional<Customer> email_result = customerIdentityRepository.findByEmail(custDetails.getEmail());
		if(email_result.isPresent()) {
			Optional<Customer> result = customerIdentityRepository.findByEmailAndDateOfBirth(custDetails.getEmail(),custDetails.getDob());
			if(result.isEmpty()) {
				return new ResponseEntity<Object>("Invalid Details",HttpStatus.BAD_REQUEST);
			}
			else {
				return new ResponseEntity<Object>("Valid Details",HttpStatus.OK);
			}
		}
		return new ResponseEntity<>("No request Available",HttpStatus.OK);
	}

	public ResponseEntity<Object> getAllInfo(Long simNumber) {
		SimInfoDTO simResult = simFeign.getSimInfo(simNumber);
		PlanDTO planResult = planFeign.getPlan(simResult.getSimId());
		Optional<Customer> customerResult = customerIdentityRepository.findBySimId(simResult.getSimId());
		AddressDTO addressResult = addressFeign.getAddress(customerResult.get().getCustomerAddress_addressId());
		Map<String,Object> resultMap = new HashMap<String, Object>();
		resultMap.put("simDetails", simResult);
		resultMap.put("PlanDetails", planResult);
		resultMap.put("customerDetails", customerResult.get());
		resultMap.put("addressDetails", addressResult);
		return new ResponseEntity<>(resultMap,HttpStatus.OK);
	}
}
