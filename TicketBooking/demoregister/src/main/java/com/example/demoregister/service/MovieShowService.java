package com.example.demoregister.service;

import com.example.demoregister.entity.Movie;
import com.example.demoregister.entity.MovieShow;

import com.example.demoregister.repository.MovieShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieShowService {
    @Autowired
    public MovieShowRepository repo;




    public List<MovieShow> getShowByMovieId(Movie movie){
        return repo.findShowByMovieId(movie);

    }

    public MovieShow getShowById(Long showId) {
        return repo.findShowById(showId);
    }

//    public MovieShow getMovieShowByShowId(Long showId) {
//        return  repo.findShowByMovieId(showId);
//    }
}
