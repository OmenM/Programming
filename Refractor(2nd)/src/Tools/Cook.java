package Tools;

import Model.Food;
import Model.Pasta;
import Model.Pizza;
import Model.Sandwich;

import java.util.ArrayList;

public class Cook {
    private String name;
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Order> orders = new ArrayList<>();
    private ArrayList<Food> inventory = new ArrayList<>();

    public Cook(String name){
        this.name = name;
        makeFood();
    }

    public void makeFood(){
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

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public ArrayList<Food> getInventory() {
        return inventory;
    }

    public void newCustomer(Customer customer) {
            customers.add(customer);
    }

}
