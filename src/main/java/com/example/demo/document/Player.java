package com.example.demo.document;

import java.util.Map;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
public class Player {
	
	@Id
	private Integer playerId;
	private String pname;
	private String paddrs;
	private String country;
	private Set<Sport>sports; // has a property for one to many
	private Map<String, Medal> medals; // has a property for one to many

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", pname=" + pname + ", paddrs=" + paddrs + ", country=" + country
				+ "]";
	}

}
