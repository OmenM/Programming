package Model;

public abstract class items{
    private String name;
    double price;

    public items(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public abstract double getHowMuch(double d);

}
