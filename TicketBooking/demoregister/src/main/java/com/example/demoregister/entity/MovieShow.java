package com.example.demoregister.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;


@Entity
public class MovieShow {

    @Id
    private Long showId;

    @Column(nullable = false)
    private String movieDate;

    @Column(nullable = false )
    private String movieTime;
    @JsonIgnore
    @ManyToOne
    private Movie movie;

    public MovieShow(){

    }
    public MovieShow(Long showId,String movieDate, String movieTime){
        this.showId=showId;
        this.movieDate=movieDate;
        this.movieTime=movieTime;
    }

    public String getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(String movieTime) {
        this.movieTime = movieTime;
    }
    public String getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(String movieDate) {
        this.movieDate = movieDate;
    }
    public Long getShowId() {
        return showId;
    }

    public void setShowId(Long showId) {
        this.showId = showId;
    }

}
