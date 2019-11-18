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
    public double getHowMuch() {
        if (isDelux) {
            return 2;
        }
        return 0;
    }
    //if delux add 3 bucks
}
