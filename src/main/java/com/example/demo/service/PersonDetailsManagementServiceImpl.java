package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.document.PersonDetails;
import com.example.demo.repo.IPersonalDetailsRepo;

@Component("PesonService")
public class PersonDetailsManagementServiceImpl implements IpersonManagementService {
	
	@Autowired
	private IPersonalDetailsRepo personRepo;

	@Override
	public String RegisterPerson(PersonDetails details) {
		return "Person saved with id:: " + personRepo.save(details).getPid();
	}

	@Override
	public List<PersonDetails> fetchAllPersonDetails() {
		return personRepo.findAll();
	}

}
