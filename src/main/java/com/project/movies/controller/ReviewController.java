package com.project.movies.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.movies.entity.Review;
import com.project.movies.service.ReviewService;


@RestController
@RequestMapping("/api/review")
@CrossOrigin(origins = "*", allowedHeaders = "*", maxAge=3600, methods = RequestMethod.POST)
public class ReviewController {
	 @Autowired
	    private ReviewService reviewService;
	 
	    @PostMapping("/addReview")
	    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload) {

	        return new ResponseEntity<Review>(reviewService.createReview(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.OK);
	    }

}
