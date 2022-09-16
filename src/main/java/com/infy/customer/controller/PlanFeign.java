package com.infy.customer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.infy.customer.dto.PlanDTO;

@FeignClient(name = "PlanMS",url = "http://localhost:9000")
public interface PlanFeign {
	
	@RequestMapping("plan/getOffer/{simId}")
	PlanDTO getPlan(@PathVariable("simId") Integer simId);
}
