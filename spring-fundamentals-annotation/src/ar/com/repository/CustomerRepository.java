package ar.com.repository;

import java.util.List;

import ar.com.model.Customer;

public interface CustomerRepository {

	public abstract List<Customer> findAll();

}