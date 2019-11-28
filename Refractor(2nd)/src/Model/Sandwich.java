package Model;


public class Sandwich extends Food {
    String name;
    double Price;
    boolean SMALL, MEDIUM, LARGE;

    public enum Size{
        SMALL(6.5), MEDIUM(8.0), LARGE(10.5);
        public String name;
        private double Price;

        Size(double d){
            Price = Price;}
        double getPrice() {
            return Price;
        }
    }

   public Sandwich(String name, double Price, boolean size){
       super("Sandwich",6.5);

   }

    public double getPrice() {
        if(SMALL){
            setName("Small Sandwich");
            return Price;
        }
        else if(MEDIUM){
            setName("Medium Sandwich");
            return Price + 1.5;
        }
        else if(LARGE) {
            setName("Large Sandwich");
            return Price + 4;
        }
        return 0;
    }

}
