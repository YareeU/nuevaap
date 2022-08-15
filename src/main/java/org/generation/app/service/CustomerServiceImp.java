package org.generation.app.service;

import java.util.List;
import org.generation.app.entity.Customer;
import org.generation.app.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImp implement ICustomerService{

	@Override
	public List<Customer> findAllCustomer(){
		return(List<Customer>) customerRepository.findAll();
	}
	
	@Override
	public Customer saveCustomer(Customer customer){
		return CustomerRepository.save(customer);
	}
	
	@Override
	public Customer deleteCustomerById(Long Id){
		return CustomerRepository.delete(customer);
	}
	
	@Override
	public Customer findCustomerById(Long Id) {
	
		return customerRepository.findById(Id).orElse(null);
	}

	
}
