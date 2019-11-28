package Model;


public class Pizza extends Food {
    String name;
    double price;
    boolean isDeluxe;

    public Pizza(String name, double price, boolean deluxe) {
        super("Pizza", 5);
        isDeluxe = deluxe;
    }

    @Override
    public double getPrice() {
        //if deluxe add 3 bucks
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
