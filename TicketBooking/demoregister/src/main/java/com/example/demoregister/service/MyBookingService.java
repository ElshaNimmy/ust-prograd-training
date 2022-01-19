package com.example.demoregister.service;

import com.example.demoregister.entity.MyBookings;
import com.example.demoregister.repository.MyBookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookingService {
    @Autowired
    private MyBookingRepository repo;
    public void saveBookings(MyBookings mybookings) {
        repo.save(mybookings);
    }


    public List<MyBookings> getBookingsByUserName(String userName) {
        return repo.findBookingsByUserId(userName);
    }
}
