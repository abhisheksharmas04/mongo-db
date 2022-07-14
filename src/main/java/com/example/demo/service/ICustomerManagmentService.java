package com.example.demo.service;

import java.util.List;

import com.example.demo.document.Customer;

public interface ICustomerManagmentService {
	public List<Customer>fetchCustomerByBillAmtRange(double start, double end);
	public List<Customer>fetchCustomersByUsingCaddAndHavingMobileNo(String...address);
}
