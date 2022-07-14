package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.document.Customer;

public interface ICustomerRepo extends MongoRepository<Customer, String> {

}
