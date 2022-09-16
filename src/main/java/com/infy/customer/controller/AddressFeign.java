package com.infy.customer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.infy.customer.dto.AddressDTO;

@FeignClient(name = "AddressMS",url = "http://localhost:9000")
public interface AddressFeign {
	@RequestMapping("address/get/{addressId}")
	AddressDTO getAddress(@PathVariable("addressId") Integer addressId);
}
