package com.infy.customer.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.infy.customer.dto.SimInfoDTO;

@FeignClient(name = "SimService",url = "http://localhost:9000")
public interface SimFeign {
	@RequestMapping("sim/getinfo/{simNumber}")
	SimInfoDTO getSimInfo(@PathVariable("simNumber") Long simNumber);
}
