package com.example.demoregister.entity;

import javax.persistence.*;

@Entity
public class MyBookings {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "username")
    private String userName;
    @Column(name = "showTime")
    private String showTime;
    @Column(name = "moviedate")
    private String movieDate;
    @Column(name = "ticketcount")
    private Integer ticketCount;
    @Column(name = "moviename")
    private String movieName;
    private String seats;
    private Integer amount;

    public MyBookings() {

    }

    public MyBookings(String userName, String showTime, String movieDate, Integer ticketCount, String seats,Integer amount, String movieName) {
        this.userName = userName;
        this.showTime=showTime;
        this.movieDate = movieDate;
        this.ticketCount = ticketCount;
        this.seats = seats;
        this.amount = amount;
        this.movieName = movieName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }
    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(String movieDate) {
        this.movieDate = movieDate;
    }

    public Integer getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(Integer ticketCount) {
        this.ticketCount = ticketCount;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }





}
