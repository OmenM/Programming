public class MainClass
{
    public static void main(String[] args) {
        X x = new Y();
        x.calculate(10,20);
        Y y = (Y) x;
        y.calculate(50, 100);
        Z z = new Z();
        z.calculate(100,200);
    }
}