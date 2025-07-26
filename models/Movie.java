package BookMyShow.models;
import java.time.LocalDate;

public class Movie {
    private String name;
    private int Id;
    private static int IdCounter=100;
    private String language;
    private String genre;
    private LocalDate dateOfRelease;

    public Movie(String name, String language, String genre, LocalDate releasDate){
        this.Id=this.IdCounter++;
        this.name=name;
        this.language=language;
        this.genre=genre;
        this.dateOfRelease=releasDate;
    }

    public int getId(){
        return this.Id;
    }

    public String getName(){
        return this.name;
    }

    public String getLanguage(){
        return this.language;
    }

    public String getGenre(){
        return this.genre;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setLanguage(String language){
        this.language=language;
    }

    public void setGenre(String genre){
        this.genre=genre;
    }

    public LocalDate getReleaseDate(){
        return this.dateOfRelease;
    }
    
    public void setReleaseDate(LocalDate date){
        this.dateOfRelease=date;
    }

    public String toString(){
        return "Id: "+this.Id+" Name: "+this.name+" Language: "+this.language+" Genre: "+this.genre+" Date of Release: "+this.getReleaseDate();
    }
}
