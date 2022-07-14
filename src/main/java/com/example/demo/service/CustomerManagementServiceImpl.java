package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.document.Customer;
import com.example.demo.repo.ICustomerRepo;

@Service("custService")
public class CustomerManagementServiceImpl implements ICustomerManagmentService {
	
	@Autowired
	private ICustomerRepo custRepo;

	@Override
	public String registerCustomer(Customer customer) {
		return "Customer is saved with id:: " + custRepo.save(customer).getId();
		//return "Customer is saved with id:: " + custRepo.insert(customer).getId();
	}

	@Override
	public List<Customer> findAllCustomers() {
		return custRepo.findAll();
	}

	@Override
	public String removeCustomer(String id) {
		//GEt document by Id
		Optional<Customer> cust = custRepo.findById(id);
		if(cust.isPresent()) {
			custRepo.delete(cust.get());
			return "Document Deleted";
		}
		return "Document Not Found";
	}

}


/*
 difference between CurdRepository(I) save() & MongoRepostiory (U) method?
 	save(-): 
 		--> can perform insert or update entity or document operation
 		--> Common for both sql and No sql database s/w
 		--> Supports code portability from Sql to No-sql db and vice-versa
 		--> Recomanded to use
 		
 	insert(-):
 		--> Can perform only insert document operation
 		--> Specific method for MongoDB
 		--> Does not support code portibility.
 		--> Not recommanded to use
 */
