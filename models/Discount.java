package BookMyShow.models;

public class Discount {
    private int Id;
    private static int IdCounter=100;
    private float discountPercent;
    private String name;
    private String description;
    private Customer customer;

    public Discount(float discountPercent, Customer customer, String name, String description){
        this.Id=IdCounter++;
        this.customer=customer;
        this.name=name;
        this.description=description;
        this.discountPercent=discountPercent;
    }

    public Discount(float discountPercent, Customer customer){
        this.Id=IdCounter++;
        this.customer=customer;
        this.discountPercent=discountPercent;
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

    public String getDescription(){
        return this.description;
    }

    public Customer getCustomer(){
        return this.customer;
    }

    public void setDescription(String description){
        this.description=description;
    }

    public float getDiscountPercent(){
        return this.discountPercent;
    }

}
