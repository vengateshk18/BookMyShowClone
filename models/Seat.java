package BookMyShow.models;

enum SeatType{
    NORMAL, PREMIUM, VIP
}

public class Seat {
    private int Id;
    private static int IdCounter=100;
    private String name;
    private Hall hall;
    private boolean isBooked;
    private SeatType seatType;
    private int price;

    Seat(Hall hall, String name, SeatType type, int price){
        this.Id=IdCounter++;
        this.name=name;
        this.hall=hall;
        this.isBooked=false;
        this.seatType=type;
        this.price=price;
    }

    public int getId(){
        return this.Id;
    }

    public String getName(){
        return this.name;
    }

    public Hall getHall(){
        return this.hall;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setHall(Hall hall){
        this.hall=hall;
    }

    public boolean getBookingStatus(){
        return this.isBooked;
    }

    public void setBookingStatus(){
        this.isBooked=true;
    }

    public SeatType getSeatType(){
        return this.seatType;
    }

    public void setSeatType(SeatType type){
        this.seatType=type;
    }

    public int getPrice(){
        return this.price;
    }

    public void setPrice(int price){
        this.price=price;
    }
}
