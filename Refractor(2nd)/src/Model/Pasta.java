package Model;

public class Pasta extends Food {
    String name;
    double price;
    boolean isDeluxe;

    public Pasta(String name, double price, boolean deluxe){
        super("Pasta", 3);
        isDeluxe = deluxe;
        if (isDeluxe){
        setName("Deluxe Pasta");
        }
    }

    @Override
    public double getPrice() {
        //if deluxe add 2 bucks
        if (isDeluxe) {
                return price + 2;
        }
        else {
            return price;
            }
        }
    }
