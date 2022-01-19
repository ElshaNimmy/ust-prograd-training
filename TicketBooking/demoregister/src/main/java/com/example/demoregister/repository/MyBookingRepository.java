package com.example.demoregister.repository;

import com.example.demoregister.entity.MyBookings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyBookingRepository extends JpaRepository<MyBookings,Long> {
    @Query("Select myBookings from MyBookings myBookings where myBookings.userName=:userName")
    List<MyBookings> findBookingsByUserId(String userName);
}
