package ar.com.repository;

import java.util.ArrayList;
import java.util.List;

import ar.com.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRespository {
	
	/* (non-Javadoc)
	 * @see ar.com.repository.CustomerRespository#findAll()
	 */
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
