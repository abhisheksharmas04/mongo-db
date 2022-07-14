package com.example.demo.service;

import java.util.List;

import com.example.demo.document.Customer;

public interface ICustomerManagmentService {
	public String registerCustomer(Customer customer);
	public List<Customer>findAllCustomers();
	public String removeCustomer(String id);
}
