package ar.com.service;

import java.util.List;

import ar.com.model.Customer;

public interface CustomerService {

	public abstract List<Customer> findAll();

}