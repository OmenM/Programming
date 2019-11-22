package Tools;

import Model.Food;
import Model.Pasta;
import Model.Pizza;
import Model.Sandwich;

import java.util.ArrayList;

public class mainthing {
    private String name;
    private ArrayList<Customer> ppl = new ArrayList<>();
    private ArrayList<Order> ordds = new ArrayList<>();
    private ArrayList<Food> invent = new ArrayList<>();

    public mainthing(String name){
        this.name = name;
        startStuff();
    }

    public void startStuff(){
        for(int i = 0 ; i< 5;i++){
            makePizza();
            makePasta();
            makesand();
        }
    }

    private void makePizza() {
        invent.add(new Pizza());
    }
    private void makePasta(){
        invent.add(new Pasta());
    }
    private void makesand(){
        invent.add(new Sandwich());
    }
}
