package ar.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.model.Customer;
import ar.com.repository.CustomerRespository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRespository customerRepository;

	public CustomerServiceImpl() {}

	// @Autowired
	public CustomerServiceImpl(CustomerRespository customerRepository) {
		System.out.println("We're using constructor injection");
		this.customerRepository = customerRepository;
	}

	// @Autowired
	public void setCustomerRepository(CustomerRespository customerRepository) {
		System.out.println("We're using setter injection");
		this.customerRepository = customerRepository;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ar.com.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

}
