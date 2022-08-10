package com.mooc.mooc.classes;

import lombok.Getter;
import lombok.Setter;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;


public class Student {
	@Id
	@Getter
	private String id;

	@Setter@Getter
	private String firstName;
	@Setter@Getter
	private String lastName;
	@Setter@Getter
	private String middleName;
	@Getter@Setter
	private Photo photo;


}
