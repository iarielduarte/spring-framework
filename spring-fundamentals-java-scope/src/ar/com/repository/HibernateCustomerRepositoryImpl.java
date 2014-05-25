package ar.com.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import ar.com.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRespository {
	
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer c = new Customer();
		c.setFirstname("Ariel");
		c.setLastname("Duarte");
		
		customers.add(c);
		return customers;
	}

}
