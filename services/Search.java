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

    public List<Movie> searchMoviebyCity(City city){
        List<Movie> answers=new ArrayList<>();
        
        for(Theatre theatre:city.getAllTheatres()){
            for(Show show:theatre.getAllShows()){
                answers.add(show.getMovie());
            }
        }

        return answers;
    }
    
    public HashMap<Theatre,List<Show>>  getTheatresbyMovie(Movie movie){

        HashMap<Theatre, List<Show>> answers = new HashMap<Theatre, List<Show>>();
        HashMap<Integer,Theatre> theatres=this.database.getAllTheatres();
        for(int theatreId: theatres.keySet()){
            Theatre theatre=theatres.get(theatreId);
            List<Show> shows=new ArrayList<>();
            for(Show show:theatre.getAllShows()){
                if(show.getMovie()==movie){
                    shows.add(show);
                }
            }
            if(shows.size()>0){
                answers.put(theatre, shows);
            }
        }

        return answers;
    } 

}
