package Model;


public class Sandwich extends Food {
    String name;
    double price;
    boolean SMALL, MEDIUM, LARGE;

    public enum Size{
        SMALL(6.5), MEDIUM(8.0), LARGE(10.5);
        public String name;
        private double price;

        Size(double d){price = price;}
        double getPrice() {
            return price;
        }
    }

   public Sandwich(String name, double price, boolean size){
       super("Sandwich",6.5);

   }

    public double getPrice() {
        if(SMALL){
            setName("Small Sandwich");
            return price;
        }
        else if(MEDIUM){
            setName("Medium Sandwich");
            return price + 1.5;
        }
        else if(LARGE) {
            setName("Large Sandwich");
            return price + 4;
        }
        return 0;
    }

}
