package com.capgemini.customerapp.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.customerapp.entities.Customer;
import com.capgemini.customerapp.repository.CustomerRepository;
import com.capgemini.customerapp.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public Customer authenticate(int customerId, String password) {
		Optional<Customer> optionalCustomer =customerRepository.findById(customerId);
		return optionalCustomer.get();
	}
	@Override
	public Customer findCustomerById(int customerId) {
		Optional<Customer> customer = customerRepository.findById(customerId);
		return customer.get();
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public void deleteCustomer(int customerId) {
		customerRepository.deleteById(customerId);
	}

}
