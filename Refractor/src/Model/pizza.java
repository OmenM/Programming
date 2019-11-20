package Model;

public class pizza extends items {
    boolean isDelux;

    public pizza(String name, double howMuch, boolean isDelux) {
        super(name, howMuch);
    }

    public pizza(String name, double howMuch) {
        super(name, howMuch);
    }

    @Override
    //if delux add 3 bucks
    public double getHowMuch() {
        double price = getHowMuch();
        if (isDelux) {
            setName("Pastaaa");
            return price +3;
        }
        else{
            setName("Pasta");
            return price ;
        }
    }

}
