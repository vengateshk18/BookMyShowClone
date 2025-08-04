package BookMyShow.repositery;

import BookMyShow.models.*;
import java.util.*;


public class Database {
    private HashMap<Integer,City> citiesMap;
    private HashMap<Integer,Theatre> theatresMap;
    private HashMap<Integer,Hall> hallsMap;
    private HashMap<Integer,Customer> customerMap;
    private HashMap<Integer, Show> showMap;
    private HashMap<Integer, Movie> movieMap;
    private HashMap<Integer,Booking> bookingMap;
    private HashMap<Integer,Booking> bookingMap;

    public Database(){
        this.citiesMap=new HashMap<>();
        this.theatresMap=new HashMap<>();
        this.hallsMap=new HashMap<>();
        this.customerMap=new HashMap<>();
        this.showMap=new HashMap<>();
        this.movieMap=new HashMap<>();
        this.bookingMap=new HashMap();
    }

    public HashMap<Integer,City> getAllCities(){
        return this.citiesMap;
    }

    public HashMap<Integer,Theatre> getAllTheatres(){
        return this.theatresMap;
    }

    public HashMap<Integer,Hall> getAllHalls(){
        return this.hallsMap;
    }

    public HashMap<Integer,Customer> getAllCustomers(){
        return this.customerMap;
    }

    public HashMap<Integer,Show> getAllShows(){
        return this.showMap;
    }

    public HashMap<Integer,Movie> getAllMovies(){
        return this.movieMap;
    }

    public void addCity(City city){
        this.citiesMap.put(city.getId(),city);
    }

    public void addTheatre(Theatre city){
        this.theatresMap.put(city.getId(),city);
    }

    public void addHall(Hall city){
        this.hallsMap.put(city.getId(),city);
    }

    public void addCustomer(Customer city){
        this.customerMap.put(city.getId(),city);
    }

    public void addShow(Show city){
        this.showMap.put(city.getId(),city);
    }

    public void addMovie(Movie city){
        this.movieMap.put(city.getId(),city);
    }

    public City getCity(int index){
        if(this.citiesMap.containsKey(index)){
            return this.citiesMap.get(index);
        }

        return null;
    }

    public Theatre getTheatre(int index){
        if(this.theatresMap.containsKey(index)){
            return this.theatresMap.get(index);
        }

        return null;
    }

    public Hall getHall(int index){
        if(this.hallsMap.containsKey(index)){
            return this.hallsMap.get(index);
        }

        return null;
    }

    public Show getShow(int index){
        if(this.showMap.containsKey(index)){
            return this.showMap.get(index);
        }

        return null;
    }

    public Customer getCustomer(int index){
        if(this.customerMap.containsKey(index)){
            return this.customerMap.get(index);
        }

        return null;
    }

    public Movie getMovie(int index){
        if(this.movieMap.containsKey(index)){
            return this.movieMap.get(index);
        }

        return null;
    }

    public Booking getBooking(int index){
        if(this.bookingMap.containsKey(index)){
            return this.bookingMap.get(index);
        }

        return null;
    }

    public void addBooking(Booking booking){
        this.bookingMap.put(booking.getId(),booking);
    }

    public HashMap<Integer,Booking> getAllBookings(){
        return this.bookingMap;
    }

}
