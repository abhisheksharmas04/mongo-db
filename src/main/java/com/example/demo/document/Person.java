package com.example.demo.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
public class Person {
	
	@Id
	private Integer pid;
	private String pname;
	private String padd;
	private DrivingLicense license; // Has-a property
	
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", padd=" + padd + "]";
	}
	
}
