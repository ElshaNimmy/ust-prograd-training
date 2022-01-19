package com.example.demoregister.repository;

import com.example.demoregister.entity.BookedSeats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookedSeatsRepository extends JpaRepository<BookedSeats,Long> {
    @Query("Select seats from BookedSeats seats where seats.showId=:showId and seats.seatId=:seatId")
    BookedSeats findBookedSeatByShowIdAndSeatId(Long showId,Long seatId);


}
