package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.document.Customer;
import com.example.demo.generator.IdGenerator;
import com.example.demo.service.ICustomerManagmentService;

@Component
public class MongoDbTestRunner implements CommandLineRunner {
	
	@Autowired
	private ICustomerManagmentService service;

	@Override
	public void run(String... args) throws Exception {
		/*Customer cst = new Customer();
		cst.setCno(101);
		cst.setCname("Rajesh");
		cst.setCadd("Jpr");
		cst.setBillAmt(5000.0);
		System.out.println(service.registerCustomer(cst));*/
		
		/*Customer cst1 = new Customer();
		cst1.setCno(102);
		cst1.setCname("Rajesh");
		System.out.println(service.registerCustomer(cst1));*/
		
		/*Customer cst1 = new Customer();
		cst1.setCno(103);
		cst1.setCname("Sunil");
		cst1.setCadd("Ind");
		cst1.setBillAmt(4999.0);
		cst1.setMobileNo("99999999999");
		System.out.println(service.registerCustomer(cst1));*/
		
		//-----------------Save Operation Having Custome ID Generator----------------------------------
		/*Customer cst1 = new Customer();
		cst1.setId(IdGenerator.generateId());
		cst1.setCno(104);
		cst1.setCname("Mahesh");
		cst1.setCadd("Kot");
		cst1.setBillAmt(1599.0);
		cst1.setMobileNo("88888888888");
		System.out.println(service.registerCustomer(cst1));*/
		
		//--------------------Find all Method -------------------------------------------------------
		/*service.findAllCustomers().forEach(cust ->{
			System.out.println(cust);
		});*/
		
		//--------------------Delete Document -------------------------------------------------------
		System.out.println(service.removeCustomer("62cf690e18f2526110dd6ca1"));
	}

}
