package com.mooc.mooc.classes.repositories;

import com.mooc.mooc.classes.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoRepository extends MongoRepository<Photo, String> {
}
