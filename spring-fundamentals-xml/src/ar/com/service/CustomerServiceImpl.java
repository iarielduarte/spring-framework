package ar.com.service;

import java.util.List;

import ar.com.model.Customer;
import ar.com.repository.CustomerRespository;

public class CustomerServiceImpl implements CustomerService {
	
	private CustomerRespository customerRepository;
	
	public CustomerServiceImpl(){
		
	}
	
	public CustomerServiceImpl(CustomerRespository customerRepository){
		this.customerRepository = customerRepository;
	}
	
	public void setCustomerRepository(CustomerRespository customerRepository) {
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
