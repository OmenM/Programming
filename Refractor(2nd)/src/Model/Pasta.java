package Model;

public class Pasta extends Food {
    String name;
    double price;
    boolean isDelux;

    Pasta(String name, double price, boolean delux){
        super("Pasta", 3);
        isDelux = delux;
    }

    @Override
    public double getHowMuch() {
        //if delux add 2 bucks
        return 0;
    }
}
