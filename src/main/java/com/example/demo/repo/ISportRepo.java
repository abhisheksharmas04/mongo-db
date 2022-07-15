package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.document.Sport;

public interface ISportRepo extends MongoRepository<Sport, String> {

}
