package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.document.Customer;
import com.example.demo.repo.ICustomerRepo;

@Service("custService")
public class CustomerManagementServiceImpl implements ICustomerManagmentService {
	
	@Autowired
	private ICustomerRepo custRepo;

	@Override
	public List<Customer> fetchCustomerByBillAmtRange(double start, double end) {
		return custRepo.findByBillAmtBetween(start, end);
	}

	@Override
	public List<Customer> fetchCustomersByUsingCaddAndHavingMobileNo(String... address) {
		return custRepo.findByCaddInAndMobileNoIsNotNull(address);
	}

}