package ar.com.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import ar.com.model.Customer;

@Repository("customerRespository")
public class HibernateCustomerRepositoryImpl implements CustomerRespository {
	
	@Value("${someProperty}")
	private String someValue;
	
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<Customer>();
		
		Customer c = new Customer();
		c.setFirstname(someValue);
//		c.setFirstname("Ariel");
		c.setLastname("Duarte");
		
		customers.add(c);
		return customers;
	}

}
