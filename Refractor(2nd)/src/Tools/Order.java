package Tools;

import Model.Food;
import Model.Pizza;
import Tools.Time.Time;

import java.util.ArrayList;

public class Order {
    ArrayList<Food> Order = new ArrayList<>();
    Time start;
    Time end;
    boolean out;
    boolean complete;

    public Order(ArrayList<Food> order, Time start){
        //if not in inventory add 10 minutes to order
        Order = order;
        this.start = start;
        end = new Time(start);
        for(int i = 0; i < 20;i++){
            end.tick();
        }
        out = false;
        complete = false;
    }


    @Override
    public String toString() {
        return "Order{" +
                "Order=" + Order +
                ", start=" + start +
                ", end=" + end +
                ", out=" + out +
                ", complete=" + complete +
                '}';
    }

    public ArrayList<Food> getOrder() {
        return Order;
    }

    public void setOrder(ArrayList<Food> order) {
        Order = order;
    }

    public void InProgress(){
        out = true;
    }
    public void delivered(){
        complete = true;
    }
    public double getTotalPrice(){
        return 0;
    }
}
