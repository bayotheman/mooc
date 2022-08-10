package com.mooc.mooc.classes;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("courses")
@ToString @EqualsAndHashCode
public class Course {

	@Id@Getter
	private String id;
	@Getter@Setter
	private Program program;
	@Getter@Setter
	private String code;
	@Getter@Setter
	private String title;
	@Getter@Setter
	private String description;
	@Getter@Setter
	private Integer unit;
	@Getter@Setter
	private List<Lab> lab;
//	public String assignment;
	@Getter@Setter
	private List<Lecture> lecture;
	@Getter@Setter
	private List<String> syllabus;
	@Getter@Setter
	private Double grade;

	public Course(){}

	public Course(String id, String code, String title, String description,
	              Integer unit, List<Lecture> lecture, List<String> syllabus) {
		this.id = id;
		this.code = code;
		this.title = title;
		this.description = description;
		this.unit = unit;
		this.lecture = lecture;
		this.syllabus = syllabus;
	}



}
