package BookMyShow.models;

public class Customer {
    private int Id;
    private int IdCounter=100;
    private String name;
    private String phoneNumber;
    private String email;
    private String password;
    public Customer(String name, String password, String email, String phoneNumber){
        this.Id=this.IdCounter++;
        this.name=name;
        this.password=password;
        this.email=email;
        this.phoneNumber=phoneNumber;
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