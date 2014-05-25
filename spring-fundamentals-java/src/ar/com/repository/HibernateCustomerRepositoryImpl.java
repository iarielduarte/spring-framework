package ar.com.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import ar.com.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRespository {
	
	@Value("${firstName}")
	private String firstNameValue;
	
	@Value("${lastName}")
	private String lastNameValue;
	
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer c = new Customer();
		c.setFirstname(firstNameValue);
		c.setLastname(lastNameValue);
		
		customers.add(c);
		return customers;
	}

}
