package com.example.demo.generator;

import java.util.UUID;

public class IdGenerator {
	
	public static String generateId() {
		System.out.println(UUID.randomUUID());
		return UUID.randomUUID().toString().replace("-","").substring(0,10);
	}

}
