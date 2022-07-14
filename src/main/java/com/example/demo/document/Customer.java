package com.example.demo.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Customer {
	
	@Id
	public String id;
	public Integer cno;
	public String cname;
	public String cadd;
	private Double billAmt;
	private String mobileNo;

}
