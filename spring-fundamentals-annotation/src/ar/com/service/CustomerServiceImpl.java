package ar.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.model.Customer;
import ar.com.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	public CustomerServiceImpl() {
	}

	// @Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("We're using constructor injection");
		this.customerRepository = customerRepository;
	}

	// @Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {
		System.out.println("We're using setter injection");
		this.customerRepository = customerRepository;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
