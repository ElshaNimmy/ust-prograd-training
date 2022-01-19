package com.example.demoregister.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Movie {

    @Id
    private Long movieId;

    @Column(nullable = false)
    private String movieName;

    @Column(nullable = false )
    private Integer ticketCount; ;

    @Column(nullable = false)
    private String releaseDate;

    private Integer price;

  @OneToMany
    private List<MovieShow> movieShow;

    public Movie(){

    }
    public Movie(Long movieId,String movieName, Integer ticketCount,String releaseDate,Integer price) {

        this.movieName = movieName;
        this.ticketCount = ticketCount;
        this.releaseDate=releaseDate;
        this.movieId=movieId;
        this.price=price;
    }
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }
    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getTicketCount() {
        return ticketCount;
    }
    public void setTicketCount(Integer ticketCount) {
        this.ticketCount = ticketCount;
    }
    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }



}
