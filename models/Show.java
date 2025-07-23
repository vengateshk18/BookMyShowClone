package BookMyShow.models;
import java.time.LocalDateTime;

public class Show {
    private int Id;
    private static int IdCounter=100;
    private LocalDateTime start;
    private LocalDateTime end;
    private Movie movie;
    private Hall hall;

    Show(LocalDateTime start,LocalDateTime end, Movie movie, Hall hall){
        this.Id=IdCounter++;
        this.start=start;
        this.end=end;
        this.movie=movie;
        this.hall=hall;
    }

    public int getId(){
        return this.Id;
    }

    public LocalDateTime getStartTime(){
        return this.start;
    }

    public LocalDateTime getEndTime(){
        return this.end;
    }

    public Movie getMovie(){
        return this.movie;
    }

    public Hall getHall(){
        return this.hall;
    }

    public void setStartTime(LocalDateTime startDateTime){
        this.start=startDateTime;
    }

    public void setEndTime(LocalDateTime endDateTime){
        this.end=endDateTime;
    }

    public void setMovie(Movie movie){
        this.movie=movie;
    }

    public void setHall(Hall hall){
        this.hall=hall;
    }
}
