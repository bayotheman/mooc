package com.mooc.mooc.classes.repositories;

import com.mooc.mooc.classes.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course, String> {
}
