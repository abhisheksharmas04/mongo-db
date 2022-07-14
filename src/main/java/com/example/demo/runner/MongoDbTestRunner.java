package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.service.ICustomerManagmentService;

@Component
public class MongoDbTestRunner implements CommandLineRunner {
	
	@Autowired
	private ICustomerManagmentService service;

	@Override
	public void run(String... args) throws Exception {
		/*//---------------------------Finder Methods-----------------------------------------------
		service.fetchCustomerByBillAmtRange(4000.0, 10000.0).forEach(System.out::println);*/
		
		//---------------------------Find By addressin and mobile not null-----------------------------------------------
		service.fetchCustomersByUsingCaddAndHavingMobileNo("Jpr","Ind").forEach(System.out::println);
	}

}
