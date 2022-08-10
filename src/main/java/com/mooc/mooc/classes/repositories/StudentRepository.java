package com.mooc.mooc.classes.repositories;

import com.mooc.mooc.classes.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
}
