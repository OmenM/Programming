package Model;


public class Pizza extends Food {
    String name;
    double price;
    boolean isDeluxe;

    public Pizza(String name, double price, boolean isDeluxe) {
        super("Pizza", 5);
    }

    @Override
    public double getPrice() {
        //if delux add 3 bucks
        if(isDeluxe){
            setName("Deluxe Pizza");
            return price + 3;
        }
        else{
            setName("Pizza");
            return price;
        }
    }

}
