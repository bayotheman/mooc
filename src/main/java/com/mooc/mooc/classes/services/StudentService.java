package com.mooc.mooc.classes.services;

import com.mooc.mooc.classes.Student;
import com.mooc.mooc.classes.repositories.StudentRepository;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repository;

	public String addPhoto(MultipartFile file) throws IOException {
		Student student = new Student();
		student.setPhoto(
				new Binary(BsonBinarySubType.BINARY, file.getBytes()));
		student = repository.insert(student);
		return student.getId();
	}

	public Binary getPhoto(String id) {
		return repository.findById(id).get().getPhoto();
	}

}
