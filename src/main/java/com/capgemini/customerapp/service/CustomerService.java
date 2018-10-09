package com.capgemini.customerapp.service;

import com.capgemini.customerapp.entities.Customer;

public interface CustomerService {

	public Customer addCustomer(Customer customer);
	
	public Customer authenticate(int customerId,String password);

	public Customer findCustomerById(int customerId) ;

	public Customer updateCustomer(Customer customer);

	public void deleteCustomer(int customerId);
}
