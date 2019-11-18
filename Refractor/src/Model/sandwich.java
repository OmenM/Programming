package Model;

public class sandwich extends items{

    public sandwich(String name, Size size){
        super(name,size.getPrice());
        size = size;
    }

    public enum Size{
        SMALL(6.5), MEDIUM(8.0), LARGE(10.5);
        private double price;

        Size(double d){price = d;}
        double getPrice() {return price;}
    }

    Size size;


    @Override
    public double getHowMuch() {
        return 0;
    }
}
