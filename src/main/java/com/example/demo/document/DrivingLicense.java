package com.example.demo.document;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
public class DrivingLicense {
	@Id
	private Long lId;
	private String type;
	private LocalDateTime expiryDate;
	private Person person;

	@Override
	public String toString() {
		return "DrivingLicense [lId=" + lId + ", type=" + type + ", expiryDate=" + expiryDate + "]";
	}
}
