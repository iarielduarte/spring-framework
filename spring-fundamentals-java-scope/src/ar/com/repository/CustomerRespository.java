package ar.com.repository;

import java.util.List;

import ar.com.model.Customer;

public interface CustomerRespository {

	public abstract List<Customer> findAll();

}