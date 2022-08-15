package org.generation.app.controller;

import org.generation.app.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api") //localhost:port/api
public class CustomerRestController {
	@Autowired
	ICustomerService customerService;
	
	@GetMapping("/customers") //localhost:puerto/customers
	public List<Customer> customers(){
		return customerService.findAllCustomers();
	}
}
