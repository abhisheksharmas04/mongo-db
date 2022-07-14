package com.example.demo.service;

import java.util.List;

import com.example.demo.document.DrivingLicense;
import com.example.demo.document.Person;

public interface IRtoManagementService {
	public String savePersonWithLicense(Person person);
	public String saveLicenceWithPerson(DrivingLicense license);
	public List<Person>fetchAllPersons();

}
