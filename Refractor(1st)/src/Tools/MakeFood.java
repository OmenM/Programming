package Tools;

import Model.items;
import Model.pasta;
import Model.pizza;
import Model.sandwich;

import java.util.ArrayList;

public class MakeFood {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    private ArrayList<items> inventory = new ArrayList<>();

    public MakeFood(String name, double howMuch, boolean delux, sandwich.Size size){
        this.name = name;
        startStuff(howMuch, delux, size);
    }

    public void startStuff(double howMuch, boolean delux, sandwich.Size size){
        for(int i = 0 ; i< 5;i++){
            makePizza(howMuch);
            makePasta(howMuch, delux);
            makesand(size);
        }
    }

    private void makePizza(double howMuch) {
        inventory.add(new pizza(name, howMuch));
    }
    private void makePasta(double howMuch, boolean delux){
        inventory.add(new pasta(name, howMuch, delux));
    }
    private void makesand(sandwich.Size size){
        inventory.add(new sandwich(name, size));
    }

}
