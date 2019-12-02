package Tools;

import Model.Food;
import Tools.Time.Time;

import java.util.ArrayList;

public class Customer {
    String name;
    private Order order;
    private Time time;

    public Customer(String name, Order order, Time time) {
        this.name = name;
        ArrayList<Food> Order = new ArrayList<>();
        this.order = order;
    }

    Order getOrder(Order order){
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", order=" + order +
                ", time=" + time +
                '}';
    }
}
