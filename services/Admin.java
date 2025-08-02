package BookMyShow.services;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import BookMyShow.repositery.*;
import BookMyShow.models.*;

public class Admin {
    private Database database;
    public Admin(Database database){
        this.database=database;
    }

    public City addCity(String name){
        City cityObj=new City(name);
        this.database.addCity(cityObj);

        return cityObj;
    }

    public Theatre addTheatre(City city, String name, int numberOfHalls){
        Theatre theatreObj=new Theatre(city, name, numberOfHalls);
        this.database.addTheatre(theatreObj);

        return theatreObj;
    }

    public Hall addHall(Theatre theatre, String name, int numberOfRows, int numberOfColumns){
        Hall hallobj=new Hall(name, numberOfRows, numberOfColumns, theatre);
        this.database.addHall(hallobj);

        return hallobj;
    }

    public Customer addCustomer(String name, String password, String phoneNumber, String email){
        Customer customerObj=new Customer(name, password, email, phoneNumber);
        this.database.addCustomer(customerObj);

        return customerObj;
    }

    public Show addShow(LocalDateTime start, LocalDateTime end, Movie movie, Hall hall){
        Show showObj=new Show(start, end, movie, hall,hall.getTheatre());
        this.database.addShow(showObj);
        Theatre theatre=hall.getTheatre();
        theatre.addShow(showObj);

        return showObj;
    }

    public Movie addMovie(String name, String genre, String language, LocalDate releseDate){
        Movie movieObj=new Movie(name, language, genre, releseDate);
        this.database.addMovie(movieObj);

        return movieObj;

    }
}
