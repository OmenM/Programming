package Model;

public class Pasta extends Food {
    String name;
    double price;
    boolean isDeluxe;

    public Pasta(String name, double price, boolean deluxe){
        super("Pasta", 3);
    }

    @Override
    public double getPrice() {
        //if delux add 2 bucks
        if(isDeluxe){
            setName("Deluxe Pasta");
            return price + 2;
        }
        else{
            setName("Pasta");
            return price;
        }
    }
}
