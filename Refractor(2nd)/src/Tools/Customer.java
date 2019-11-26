package Tools;

import Tools.Time.Time;

public class Customer {
    String name;
    private Order order;
    private Time time;

    public Customer(String name, Order order) {
        this.name = name;
        time = new Time();
    }

    Order getOrder(){
        return order;
    }

}
