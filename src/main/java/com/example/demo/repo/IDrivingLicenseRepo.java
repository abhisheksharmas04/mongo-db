package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.document.DrivingLicense;

public interface IDrivingLicenseRepo extends MongoRepository<DrivingLicense, Long> {

}
