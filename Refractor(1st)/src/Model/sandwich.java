package Model;

import static Model.sandwich.Size.SMALL;

public class sandwich extends items{

    public sandwich(String name, Size size){
        super(name,size.getPrice());
        size = size;
    }

    public enum Size{
        SMALL(6.5), MEDIUM(8.0), LARGE(10.5);
        private double price;

        Size(double inch){price = inch;}
        double getPrice() {return price;}
    }

    Size size;


    public double getHowMuch(double d) {
        if (SMALL) {
            setName("Small Sandwich");
            return d;
        } else {
            return 0;
        }
    }
}
