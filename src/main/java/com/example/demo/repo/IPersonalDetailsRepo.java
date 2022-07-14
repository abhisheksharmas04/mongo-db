package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.document.PersonDetails;

public interface IPersonalDetailsRepo extends MongoRepository<PersonDetails, Integer> {

}
