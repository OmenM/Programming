package Model;

public class Pasta extends Food {
    String name;
    boolean isDeluxe;

    public Pasta(String name, double Price, boolean deluxe){
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
                return Price + 2;
        }
        else {
            return Price;
            }
        }
    }
