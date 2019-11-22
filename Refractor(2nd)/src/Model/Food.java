package Model;

public abstract class Food {
    private String name;
    private double Price;

    public Food(String name, double price) {
        this.name = name;
        this.Price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getPrice();

}
