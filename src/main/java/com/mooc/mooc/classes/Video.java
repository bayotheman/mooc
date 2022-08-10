package com.mooc.mooc.classes;

import lombok.Getter;
import lombok.Setter;

import java.io.InputStream;

public class Video {
	@Setter@Getter
	private String title;
	@Setter@Getter
	private InputStream stream;

	public Video() {
//		this.title = title;
	}
}
