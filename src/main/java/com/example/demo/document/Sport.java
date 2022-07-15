package com.example.demo.document;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
public class Sport {
	
	@Id
	private Long sid;
	private String sname;
	private Boolean teamSport;
	private Boolean isOlympicSport;
	private String[] kitItmes;
	
	@Override
	public String toString() {
		return "Sport [sid=" + sid + ", sname=" + sname + ", teamSport=" + teamSport + ", isOlympicSport="
				+ isOlympicSport + ", kitItmes=" + Arrays.toString(kitItmes) + "]";
	}

}
