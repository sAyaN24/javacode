package com.infy.customer.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.customer.dto.CustomerDetailsDTO;
import com.infy.customer.dto.PersonalDetailsDTO;
import com.infy.customer.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class Controller {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/detailVerification")
	public ResponseEntity<Object> validateDetails(@RequestBody @Valid PersonalDetailsDTO custDetails) {
		return customerService.validateDetails(custDetails);
	}
	
	@PostMapping("/activate")
	public ResponseEntity<Object> doActivation(@RequestBody @Valid CustomerDetailsDTO custDetails) {
		return customerService.activateSim(custDetails);
	}
	
	
	@GetMapping("/getallinfo/{simNumber}")
	public ResponseEntity<Object> getInfo(@PathVariable("simNumber") Long simNumber){
		return customerService.getAllInfo(simNumber);
	}
}
