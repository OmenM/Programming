package Tools;

import Model.Food;
import Model.pasta;
import Model.pizza;
import Model.sand;

import java.util.ArrayList;

public class Kitchen {
    private String name;
    private ArrayList<Customer> ppl = new ArrayList<>();
    private ArrayList<Order> ordds = new ArrayList<>();
    private ArrayList<Food> invent = new ArrayList<>();

    public Kitchen(String name){
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
        invent.add(new pizza());
    }
    private void makePasta(){
        invent.add(new pasta());
    }
    private void makesand(){
        invent.add(new sand());
    }
}
