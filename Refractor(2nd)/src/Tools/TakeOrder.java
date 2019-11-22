package Tools;

import Model.Food;
import Model.Pasta;
import Model.Pizza;
import Model.Sandwich;

import java.util.ArrayList;

public class TakeOrder {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    private ArrayList<Food> inventory = new ArrayList<>();

    public TakeOrder(String name){
        this.name = name;
        startStuff();
    }

    public void startStuff(){
        for(int i = 0 ; i< 5;i++){
            makePizza();
            makePasta();
            makeSandwich();
        }
    }

    private void makePizza() {
        inventory.add(new Pizza("Pizza",5,true));
    }
    private void makePasta(){
        inventory.add(new Pasta("Pasta",3,false));
    }
    private void makeSandwich(){
        inventory.add(new Sandwich("Sandwich",6.5,true));
    }
}
