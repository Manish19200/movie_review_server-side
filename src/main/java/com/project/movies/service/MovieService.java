package com.project.movies.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.project.movies.entity.Movie;
import com.project.movies.repository.MovieRepository;


@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;
	
	public List<Movie> findAllMovies() {
		return movieRepository.findAll();
	}

	public Optional<Movie> findMovieByImdbId(String imdbId) {
		return movieRepository.findMovieByImdbId(imdbId);
	}

}
