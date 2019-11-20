package Model;

public class pasta extends items{
    boolean isDelux;

    public pasta(String name, double howMuch, boolean delux){
        super("Pasta", 5);
        isDelux = delux;
    }

    //if delux add 2 bucks
    public double getHowMuch() {
        double price = getHowMuch();
        if (isDelux){
            return price + 2;
        }
        else{
            return price ;
        }
    }

}
