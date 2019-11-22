package Model;

public class pizza extends items {
    boolean isDelux;

    public pizza(String name, double howMuch, boolean isDelux) {
        super("Pizza", 5);
    }

    public pizza(String name, double howMuch) {
        super(name, howMuch);
    }

    @Override
    //if delux add 3 bucks
    public double getHowMuch(double d) {
        double price = getHowMuch(d);
        if (isDelux) {
            setName("Deluxe Pizza");
            return price +3;
        }
        else{
            setName("Pizza");
            return price ;
        }
    }

}
