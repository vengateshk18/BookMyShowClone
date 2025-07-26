package BookMyShow.models;
import java.util.*;

public class Hall {
    private int Id;
    private static int IdCounter=100;
    private String name;
    private int numberOfRows;
    private int numberOfColumns;
    private List<List<Seat>> seats;
    private Movie movie;
    private Theatre theatre;
    private List<Show> shows;

    public Hall(String name,int numberOfRows,int numberOfColumns,Theatre theatre){
        this.Id=IdCounter++;
        this.name=name;
        this.numberOfRows=numberOfRows;
        this.numberOfColumns=numberOfColumns;
        this.theatre=theatre;
        this.seats=new ArrayList<>();
        createSeats();
    }
    Hall(String name, Theatre theatre){
        this.Id=this.IdCounter++;
        this.name=name;
        this.seats=new ArrayList<>();
    }

    public int getId(){
        return this.Id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getNumberOfRows(){
        return this.numberOfRows;
    }

    public void setNumberOfRows(int rows){
        this.numberOfRows=rows;
    }

    public int getNumberOfColumns(){
        return this.numberOfColumns;
    }

    public void setNumberOfColumns(int columns){
        this.numberOfColumns=columns;
    }

    public Theatre getTheatre(){
        return this.theatre;
    }

    public void setTheatre(Theatre theatre){
        this.theatre=theatre;
    }

    public void createSeats(){
        for(int rowIndex=0;rowIndex<this.numberOfRows;rowIndex++){
            List<Seat> column=new ArrayList<>();
            char row=(char) (rowIndex+97);
            for(int columnIndex=1;columnIndex<=this.numberOfColumns;columnIndex++){
                String seatName=row+">"+columnIndex;
                Seat seatObj=new Seat(this, seatName);
                column.add(seatObj);
            }
            seats.add(column);
        }
    }

    public void resetSeats(){
        this.seats=new ArrayList<>();

        for(int rowIndex=0;rowIndex<this.numberOfRows;rowIndex++){
            List<Seat> column=new ArrayList<>();
            char row=(char) (rowIndex+97);
            for(int columnIndex=1;columnIndex<=this.numberOfColumns;columnIndex++){
                String seatName=row+">"+columnIndex;
                Seat seatObj=new Seat(this, seatName);
                column.add(seatObj);
            }
            seats.add(column);
        }
    }

    public List<List<Seat>> getSeats(){
        return this.seats;
    }

    public Movie getMovie(){
        return this.movie;
    }

    public void setMovie(Movie movie){
        this.movie=movie;
    }

    public List<Show> getAllShows(){
        return this.shows;
    }
    public void addShow(Show show){
        this.shows.add(show);
    }

    public String toString(){
        String ans="Id: "+this.Id+" Name: "+this.name+" numberOfRows: "+this.numberOfRows+" numberOfColumns: "+this.numberOfColumns+" Movie: "+this.movie.getName()+" Theatre: "+this.theatre.getName();
        ans+="\n";
        ans+="----------------------Here is the seats booked details------------";
        ans+="\n";
        for(int rowIndex=0;rowIndex<this.numberOfRows;rowIndex++){
            for(int columnIndex=0;columnIndex<this.numberOfColumns;columnIndex++){
                if(seats.get(rowIndex).get(columnIndex).isBooked()){
                    ans+="B\t";
                }
                else{
                    ans+="N\t";
                }
            }
            ans+="\n";
        }
        return ans;
    }
}
