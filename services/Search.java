package BookMyShow.services;
import BookMyShow.repositery.*;
import BookMyShow.models.*;
import java.util.*;
import java.time.LocalDate;

public class Search {
    private Database database;

    public Search(Database database){
        this.database=database;
    }

    public List<City> getAllCities(){
        List<City> answer=new ArrayList<>();
        HashMap<Integer,City> cities=this.database.getAllCities();
        for(Integer cityId:cities.keySet()){
            answer.add(cities.get(cityId));
        }
        return answer;
    }

    public List<Movie> searchMoviebyLanguage(String language){
        List<Movie> answer=new ArrayList<>();
        HashMap<Integer,Movie> queryset=this.database.getAllMovies();
        for(Integer movieId:queryset.keySet()){
            Movie currMovie=queryset.get(movieId);
            if(currMovie.getLanguage()==language){
                answer.add(currMovie);
            }
        }

        return answer;
    } 

    public List<Movie> searchMoviebyGenre(String genre){
        List<Movie> answer=new ArrayList<>();
        HashMap<Integer,Movie> queryset=this.database.getAllMovies();
        for(Integer movieId:queryset.keySet()){
            Movie currMovie=queryset.get(movieId);
            if(currMovie.getGenre()==genre){
                answer.add(currMovie);
            }
        }

        return answer;
    } 

    public List<Movie> searchMoviebyTitle(String title){
        List<Movie> answer=new ArrayList<>();
        HashMap<Integer,Movie> queryset=this.database.getAllMovies();
        for(Integer movieId:queryset.keySet()){
            Movie currMovie=queryset.get(movieId);
            if(currMovie.getName()==title){
                answer.add(currMovie);
            }
        }

        return answer;
    } 
    
    public List<Movie> searchMoviebyReleaseDate(LocalDate releaseDate){
        List<Movie> answer=new ArrayList<>();
        HashMap<Integer,Movie> queryset=this.database.getAllMovies();
        for(Integer movieId:queryset.keySet()){
            Movie currMovie=queryset.get(movieId);
            if(currMovie.getReleaseDate() == releaseDate){
                answer.add(currMovie);
            }
        }

        return answer;
    } 


}
