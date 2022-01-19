package com.example.demoregister.service;

import com.example.demoregister.controller.UserController;
import com.example.demoregister.entity.BookedSeats;
import com.example.demoregister.entity.Movie;
import com.example.demoregister.repository.BookedSeatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookedSeatsService {
    @Autowired
    BookedSeatsRepository repository;
    public void saveBookedSeats(BookedSeats bookedSeats){
        repository.save(bookedSeats);
    }
    public BookedSeats getBookedSeatByShowIdAndSeatId(Long showId,Long seatId){
        return repository.findBookedSeatByShowIdAndSeatId(showId,seatId);
    }
}
