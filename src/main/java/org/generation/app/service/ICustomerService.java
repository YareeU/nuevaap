package org.generation.app.service;

public interface ICustomerService {
	
	public List<Customer> findAllCustomers();

	public void deleteCustomerById(Long Id);

	public Customer findcustomerById(Long Id);
}
