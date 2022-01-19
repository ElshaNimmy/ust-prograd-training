package com.example.demoregister.service;

import com.example.demoregister.entity.Movie;
import com.example.demoregister.entity.User;
import com.example.demoregister.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    public MovieRepository repository;


    public Movie getMovieById(Long movieId) {
        return repository.getById(movieId);
    }
    public List<Movie> getAllMovies() {
        return repository.findAll();
    }
}
