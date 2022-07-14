package com.example.demo.document;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class PersonDetails {
	@Id
	private Integer pid;
	private String pname;
	private String paddress;
	private LocalDateTime dob;
	private Set<Long> mobileNo;
	private boolean martialStatus;
	private String[] nicknames;
	private List<String>academics;
	private Map<String,Long>bankAccounts;
	private Properties idDetails;
}
