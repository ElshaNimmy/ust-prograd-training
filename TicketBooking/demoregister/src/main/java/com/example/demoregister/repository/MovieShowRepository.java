package com.example.demoregister.repository;


import com.example.demoregister.entity.Movie;
import com.example.demoregister.entity.MovieShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MovieShowRepository extends JpaRepository<MovieShow,Long> {

    @Query("Select movieShow from MovieShow movieShow where movieShow.movie=:movie")
    List<MovieShow> findShowByMovieId( Movie movie);

    @Query("Select movieShow from MovieShow movieShow where movieShow.showId=:showId")
    MovieShow findShowById(Long showId);
}
