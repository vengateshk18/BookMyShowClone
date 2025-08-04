package BookMyShow.models;
import java.util.*;
import BookMyShow.constants.*;

public class Booking {
    private int ID;
    private static int IdCounter=100;
    public Customer customer;
    public Hall hall;
    private Theatre theatre;
    private List<Seat> seats;
    private Show show;
    private Movie movie;
    private PaymentType paymentType;

    public Booking(Customer customer, Hall hall, Theatre theatre, List<Seat> seats, Show show, Movie movie){
        this.ID=this.IdCounter++;
        this.customer=customer;
        this.hall=hall;
        this.theatre=theatre;
        this.seats=seats;
        this.show=show;
        this.movie=movie;
    }

    public int getId(){
        return this.ID;
    }

    public Customer getCustomer(){
        return this.customer;
    }

    public Hall getHall(){
        return this.hall;
    }

    public Theatre getTheatre(){
        return this.theatre;
    }

    public List<Seat> getSeats(){
        return this.seats;
    }

    public Show getShow(){
        return this.show;
    }

    public Movie getMovie(){
        return this.movie;
    }
}
