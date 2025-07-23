package BookMyShow.models;

public class Customer {
    private int Id;
    private int IdCounter=100;
    private String name;
    private String phoneNumber;
    private String email;
    private String password;
    Customer(String name){
        this.Id=this.IdCounter++;
        this.name=name;
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
}