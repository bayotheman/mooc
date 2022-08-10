package com.mooc.mooc.classes.services;

import com.mooc.mooc.classes.Photo;
import com.mooc.mooc.classes.repositories.PhotoRepository;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service
public class PhotoService {
	private final PhotoRepository repository;

	@Autowired
	public PhotoService(PhotoRepository repository) {
		this.repository = repository;
	}

	public String addPhoto(String title, MultipartFile file) throws IOException {
		Photo photo = new Photo(title);
		photo.setImage(
				new Binary(BsonBinarySubType.BINARY, file.getBytes()));
		photo = repository.insert(photo); return photo.getId();
	}

	public Photo getPhoto(String id){
		boolean isPresent = repository.findById(id).isPresent();
		return isPresent ? repository.findById(id).get(): new Photo("new photo");
	}
}
