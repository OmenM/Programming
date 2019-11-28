package UI;

import Model.Food;
import Model.Pasta;
import Model.Pizza;
import Model.Sandwich;
import Tools.Cook;
import Tools.Customer;
import Tools.Order;
import Tools.Time.Time;


public class Main {

    public static void main(String[] args) {
        //Try sample orders
        Cook cook = new Cook ("Cook");
        cook.newCustomer(new Customer("Ver",new Order(new Pizza("Ver",5,true))));
        System.out.println();

    }
}
