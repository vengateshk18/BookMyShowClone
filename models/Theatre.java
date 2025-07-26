package BookMyShow.models;
import java.util.*;

public class Theatre{
    private int Id;
    private int idCounter=100;
    private String name;
    private int numberOfHalls;
    private List<Hall> halls;
    private City city;

    public Theatre(City city, String name,int numberOfHalls){
        this.Id=idCounter++;
        this.city=city;
        this.name=name;
        this.numberOfHalls=numberOfHalls;
        this.halls=new ArrayList<>();
    }

    Theatre(String name,int numberOfHalls){
        this.Id=idCounter++;
        this.name=name;
        this.numberOfHalls=numberOfHalls;
        this.halls=new ArrayList<>();
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

    public City getCity(){
        return this.city;
    }

    public void setCity(City city){
        this.city=city;
    }

    public int getNumberOfHalls(){
        return this.numberOfHalls;
    }

    public void setNumberOfHalls(int numberOfHalls){
        this.numberOfHalls=numberOfHalls;
    }

    public void createHalls(){
        for(int index=0;index<this.numberOfHalls;index++){
            char hallNumber=(char) (index+48);
            Hall hallObj=new Hall(""+hallNumber, this);
            this.halls.add(hallObj);
        }
    }

    public void createHalls(List<List<Integer>> hallDimensions){
        for(int index=0;index<this.numberOfHalls;index++){
            char hallNumber=(char) (index+48);
            int numberOfRows=hallDimensions.get(index).get(0);
            int numberOfColumns=hallDimensions.get(index).get(1);
            Hall hallObj=new Hall(""+hallNumber, numberOfRows, numberOfColumns, this);
            this.halls.add(hallObj);
        }
    }

    public void resetHalls(){
        this.halls=new ArrayList<>();
        for(int index=0;index<this.numberOfHalls;index++){
            char hallNumber=(char) (index+48);
            Hall hallObj=new Hall(""+hallNumber, this);
            this.halls.add(hallObj);
        }
    }

    public List<Hall> getHalls(){
        return this.halls;
    }
}