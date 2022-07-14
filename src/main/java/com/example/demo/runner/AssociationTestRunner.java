package com.example.demo.runner;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.document.DrivingLicense;
import com.example.demo.document.Person;
import com.example.demo.service.IRtoManagementService;

@Component
public class AssociationTestRunner implements CommandLineRunner {
	
	@Autowired
	private IRtoManagementService service;

	@Override
	public void run(String... args) throws Exception {
		/*//prepare parent object
		Person per = new Person();
		per.setPid(new Random().nextInt(10000));
		per.setPname("Rajesh");
		per.setPadd("hyd");
		//prepare child object
		DrivingLicense license = new DrivingLicense();
		license.setLId(new Random().nextLong(500000));
		license.setType("two-wheeler");
		license.setExpiryDate(LocalDateTime.of(2040,10,2,2,5));
		per.setLicense(license);
		
		// invoke business method:
		System.out.println(service.savePersonWithLicense(per));*/
		
		/*//------------------------- Child to Parent ------------------------------------------------------------------------
				//prepare parent object
						Person per = new Person();
						per.setPid(new Random().nextInt(10000));
						per.setPname("Ramesh");
						per.setPadd("del");
						//prepare child object
						DrivingLicense license = new DrivingLicense();
						license.setLId(new Random().nextLong(500000));
						license.setType("Four-wheeler");
						license.setExpiryDate(LocalDateTime.of(2040,10,2,2,5));
						license.setPerson(per);
						
						// invoke business method:
						System.out.println(service.saveLicenceWithPerson(license));
		*/
		//------------------------- Fetching Parent ------------------------------------------------------------------------
		service.fetchAllPersons().forEach(persone -> {
			System.out.println(persone);
			DrivingLicense l = persone.getLicense();
			System.out.println(l);
		});
	}

}
