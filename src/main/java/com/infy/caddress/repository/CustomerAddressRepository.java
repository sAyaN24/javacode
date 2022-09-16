package com.infy.caddress.repository;

import org.springframework.data.repository.CrudRepository;

import com.infy.caddress.entity.CustomerAddress;

public interface CustomerAddressRepository extends CrudRepository<CustomerAddress, Integer>{

}
