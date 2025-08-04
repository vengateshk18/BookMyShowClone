package BookMyShow.services;
import BookMyShow.models.*;
import BookMyShow.repositery.*;
import BookMyShow.constants.*;
import java.util.*;


public class BookingService {
    private Database database;
    public BookingService(){
        this.database=database;
    }

    public boolean checkSeatAvailability(List<Seat> bookingSeats){
        for(Seat seat:bookingSeats){
            if(seat.isBooked()==true){
                return false;
            }
        }
        return true;
    }

    public boolean checkSeatAvailability(List<String> seatNames,Hall hall){
        List<Seat> bookingSeats=this.getSeats(hall, seatNames);
        for(Seat seat:bookingSeats){
            if(seat.isBooked()==true){
                return false;
            }
        }
        return true;
    }

    public List<Seat> getSeats(Hall hall, List<String> seatNames){
        List<Seat> answer=new ArrayList<>();
        List<List<Seat>> seats=hall.getSeats();
        for(List<Seat> rows:seats){
            for(Seat seat:rows){
                for(String seatName:seatNames){
                    if(seatName.equals(seat.getName())){
                        answer.add(seat);
                    }
                }
            }
        }
        return answer;
    }

    public Booking BookSeats(List<String> seatNames, Show show, Customer customer){
        Hall hall=show.getHall();
        Theatre theatre=hall.getTheatre();
        Movie movie=show.getMovie();
        List<Seat> seats=this.getSeats(hall, seatNames);
        Booking bookingObj=new Booking(customer, hall, theatre, seats, show, movie);
        
    }
}
