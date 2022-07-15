package com.example.demo.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
public class Medal {
	@Id
	private String id;
	private MadelType type;
	private String sportName;
	private Double prizeMoney;
	private String evenName;
	
	@Override
	public String toString() {
		return "Medal [id=" + id + ", type=" + type + ", sportName=" + sportName + ", prizeMoney=" + prizeMoney + ", evenName="
				+ evenName + "]";
	}
}
