package Model;

public abstract class items{
    private String name;
    private double howMuch;

    public items(String name, double price) {
        this.name = name;
        this.howMuch = price;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getHowMuch();

}
