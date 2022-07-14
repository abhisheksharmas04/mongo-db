package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.document.DrivingLicense;
import com.example.demo.document.Person;
import com.example.demo.repo.IDrivingLicenseRepo;
import com.example.demo.repo.IPersonRepo;

@Service
public class RtoManagServiceImpl implements IRtoManagementService {
	
	@Autowired
	private IPersonRepo personRepo;
	
	@Autowired
	private IDrivingLicenseRepo drivingRepo;

	@Override
	public String savePersonWithLicense(Person person) {
		return "Person Saved with ID::" + personRepo.save(person).getPid();
	}

	@Override
	public String saveLicenceWithPerson(DrivingLicense license) {
		return "License is saved with ID:: " + drivingRepo.save(license).getLId();
	}

	@Override
	public List<Person> fetchAllPersons() {
		return personRepo.findAll();
	}

}
