package com.mooc.mooc.classes;

import lombok.*;
import org.bson.BsonBinary;
import org.springframework.data.annotation.Id;

@EqualsAndHashCode @ToString
@AllArgsConstructor @NoArgsConstructor
public class Lecture {
	@Id
	@Getter
	private Long id;
	@Getter
	private String title;
	@Getter
	private Assignment assignment;
	@Getter
	private BsonBinary video;
	@Getter
	private String note;
	@Getter
	private Instructor instructor;

}
