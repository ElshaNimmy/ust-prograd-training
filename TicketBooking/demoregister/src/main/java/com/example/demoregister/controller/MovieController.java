package com.example.demoregister.controller;

import com.example.demoregister.entity.*;
import com.example.demoregister.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Objects;

@Controller
public class MovieController {
    static Long showId;
    static Long idMovie;
  //  static Long idSeat;
    @Autowired
    private UserService userService;
    @Autowired
    private MyBookingService myBookingService;
    @Autowired
    private BookedSeatsService bookedSeatsService;
    @Autowired
    private MovieService movieService;
    @Autowired
    private MovieShowService showService;

    @RequestMapping("/Movies")
    public String movieDetails(Model model) {
        model.addAttribute("movies", movieService.getAllMovies());

        return "Movies";
    }

    @RequestMapping("/MovieSlot/{movieId}")
    public String movieShow(@PathVariable Long movieId, Model model){
        Movie movie = movieService.getMovieById(movieId);
        idMovie=movie.getMovieId();
    //movieId;
        model.addAttribute("movieSlot",showService.getShowByMovieId(movie));
//        model.addAttribute("movieName",movie.getMovieName());
        return "MovieSlot";
    }


    @RequestMapping("/seat/{id}")
    public String seats(@PathVariable Long id, Model model){
        showId = id;
        return "seat";
    }


    @RequestMapping("/payment")
    public String payment(HttpServletRequest request, Model model){
        String seatsBooked=request.getParameter("bookedSeats");
        String[] seats=seatsBooked.split(",");
        System.out.println(seats.length);



        for (String seat : seats) {
            Long seatId=Long.parseLong(seat);
            BookedSeats bookedSeats=bookedSeatsService.getBookedSeatByShowIdAndSeatId(showId, seatId);
           // idSeat = bookedSeats.getSeatId();
            if (!(Objects.isNull(bookedSeats)))  {
                model.addAttribute("message", "Seat is already booked, Please choose another seat");
                return "seat";
            }
        }
        for (String seat : seats) {
            Long seatId=Long.parseLong(seat);
            BookedSeats bookedSeats=new BookedSeats(UserController.userId,showId,seatId);
            System.out.println(UserController.userId);
            System.out.println(UserController.email);
            bookedSeatsService.saveBookedSeats(bookedSeats);
        }
        User user = userService.identifyUserById(UserController.userId);
        Movie movie = movieService.getMovieById(idMovie);
        Integer amount = (seats.length)*(movie.getPrice());
        MovieShow movieShow =showService.getShowById(showId);
        model.addAttribute("amount",amount);
        //BookedSeats bookedSeats=bookedSeatsService.getBookedSeatByShowIdAndSeatId(showId, idSeat);
        model.addAttribute("showId",showId);
        //model.addAttribute("idSeat",idSeat);
//        MovieShow movieShow = showService.getMovieShowByShowId(showId);
        //model.addAttribute("idSeat",seatsBooked);
        model.addAttribute("movieName",movie.getMovieName());
        MyBookings myBookings = new MyBookings(user.getName(),movieShow.getMovieTime(),movieShow.getMovieDate(),seats.length,seatsBooked,amount,movie.getMovieName());
       myBookingService.saveBookings(myBookings);
        return "payment";
    }
    @RequestMapping("/Bookings")
    public String myBookings(Model model) {
        User user = userService.identifyUserById(UserController.userId);
        List<MyBookings> bookings = myBookingService.getBookingsByUserName(user.getName());
        model.addAttribute("bookings", bookings);
        return "Bookings";
    }

}
