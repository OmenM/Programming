package Model;

public class pasta extends Food {
    boolean isDeluxe;

    pasta(String name, double price, boolean deluxe){
        super(name, price);
        isDeluxe = deluxe;
    }

    @Override
    public double getPrice() {
        //if delux add 2 bucks
        return 0;
    }
}
