package com.project.movies.entity;

import java.time.LocalDateTime;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "review_Data")
public class Review {
	
	 private ObjectId id;
	 private String body;

	
	 public Review(String body) {
		this.body = body;
	 }
	 
	 


}
