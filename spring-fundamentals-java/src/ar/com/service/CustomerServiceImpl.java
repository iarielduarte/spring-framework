package ar.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ar.com.model.Customer;
import ar.com.repository.CustomerRespository;
import ar.com.repository.HibernateCustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {
	
	
	
	
	@Autowired // --> Autowired injection with the private attribute
	private CustomerRespository customerRepository;
	
	// --> Constructor injection
	public CustomerServiceImpl() {}
	
	// --> Constructor injection
	public CustomerServiceImpl(CustomerRespository customerRepository) {
		System.out.println("We are using constructor injection");
		this.customerRepository = customerRepository;
	}



	// --> Setter injection
//	@Autowired // --> Autowired injection into setter method
	public void setCustomerRepository(CustomerRespository customerRepository) {
		System.out.println("We are using setter injection");
		this.customerRepository = customerRepository;
	}

	

	@Override
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}

}
