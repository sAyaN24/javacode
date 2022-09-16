package com.infy.customer.repository;

import java.sql.Date;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.infy.customer.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long>{

	Optional<Customer> findByEmail(String email);

	Optional<Customer> findByEmailAndDateOfBirth(String email, Date dob);

	Optional<Customer> findByFirstNameAndLastNameAndEmail(String firstName, String lastName, String email);

	Optional<Customer> findBySimId(Integer simId);


}
