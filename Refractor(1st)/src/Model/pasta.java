package Model;

public class pasta extends items{
    boolean isDelux;

    public pasta(String name, double howMuch, boolean delux){
        super("Pasta", 5);
        isDelux = delux;
    }

    //if delux add 2 bucks
    public double getHowMuch(double d) {
        double price = getHowMuch(d);
        if (isDelux){
            setName("Fancy Pasta");
            return price + 2;
        }
        else{
            setName("Pasta");
            return price ;
        }
    }

}
