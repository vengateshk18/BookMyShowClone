package BookMyShow.models;
import java.util.*;

public class City {
    private int Id;
    private static int IdCounter=100;
    private String name;
    private List<Theatre> theatres;

    public City(String name){
        this.Id=IdCounter++;
        this.name=name;
        this.theatres=new ArrayList<>();
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

    public List<Theatre> getAllTheatres(){
        return this.theatres;
    }

    public void addTheatre(Theatre theatre){
        this.theatres.add(theatre);
    }

    public boolean removeTheatre(int theatreId){
        int theatreIndex=-1;
        for(int index=0;index<this.theatres.size();index++){
            Theatre theatre=this.theatres.get(index);
            if(theatre.getId()==theatreId){
                theatreIndex=index;
            }
        }
        if(theatreIndex!=-1){
            this.theatres.remove(theatreIndex);
            return true;
        }
        return false;
    }
}
