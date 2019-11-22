package Model;

public abstract class Food {
    private String name;
    private double howMuch;

    public Food(String name, double howMuch) {
        this.name = name;
        this.howMuch = howMuch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getHowMuch();

}
