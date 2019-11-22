package Tools;

import Model.Food;
import Tools.Time.Time;

import java.util.ArrayList;

public class Order {
    ArrayList<Food> theorderforacustomer = new ArrayList<>();
    Time start;
    Time end;
    boolean out;
    boolean complete;

    Order(ArrayList<Food> items, Time start){
        //if not in inventory add 10 minutes to order
        theorderforacustomer = items;
        this.start = start;
        end = new Time(start);
        for(int i = 0; i < 20;i++){
            end.tick();
        }
        out = false;
        complete = false;
    }

    public void deliveryInProgross(){
        out = true;
    }
    public void delivered(){
        complete = true;
    }
    public double getTotalPrice(){
        return 0;
    }
}
