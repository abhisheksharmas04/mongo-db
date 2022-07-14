package com.example.demo.service;

import java.util.List;

import com.example.demo.document.PersonDetails;

public interface IpersonManagementService {
	public String RegisterPerson(PersonDetails details);
	public List<PersonDetails>fetchAllPersonDetails();

}
