package BookMyShow;
import BookMyShow.models.*;
import BookMyShow.repositery.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import BookMyShow.services.*;

public class driver {
    public static void main(String args[]){
        Database base=new Database();
        Admin admin=new Admin(base);

        City city1=admin.addCity("Udumalai");
        Theatre theatre1=admin.addTheatre(city1, "anusham", 1);
        Hall hall1=new Hall("A", 10, 10, theatre1);
        Movie movie1=admin.addMovie("Avengers", "Action", "English", LocalDate.of(2023, 10, 1));
        hall1.setMovie(movie1);
        System.out.println(hall1.toString());
    }
}
