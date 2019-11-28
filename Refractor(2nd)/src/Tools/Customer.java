package Tools;

import Tools.Time.Time;

public class Customer {
    String name;
    private Order order;
    private Time time;

    public Customer(String name, Order order, Time time) {
        this.name = name;
        this.order = order;
        this.time = time;
    }

    public Customer(String ver, Order ver1) {
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
