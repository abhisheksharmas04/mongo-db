package com.example.demo.runner;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.document.PersonDetails;
import com.example.demo.service.IpersonManagementService;

@Component
public class MongoDbTestRunner implements CommandLineRunner {
	
	@Autowired
	private IpersonManagementService service;

	@Override
	public void run(String... args) throws Exception {
		/*//prepare Document Object
		PersonDetails details = new PersonDetails();
		details.setPid(new Random().nextInt(100000));
		details.setPname("Abhishek");
		details.setMartialStatus(false);
		details.setPaddress("Ajm");
		details.setDob(LocalDateTime.of(1998,11,24,17,54));
		details.setNicknames(new String[] {"Raj","King"});
		details.setMobileNo(Set.of(999999999L,3588888888L));
		details.setAcademics(List.of("10th","+2","BE", "ME"));
		details.setBankAccounts(Map.of("SBI",5654378L, "ICICI",45678960L));
		Properties props = new Properties();
		props.put("adhar","5343534");
		props.put("panNumber","434555L");
		details.setIdDetails(props);
		
		// invoke business method:
		System.out.println(service.RegisterPerson(details));*/
		
		service.fetchAllPersonDetails().forEach(System.out::println);
	}

}
