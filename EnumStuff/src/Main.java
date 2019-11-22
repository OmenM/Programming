public class Main {
    public static void main(String[] args) {
        MonthTest monthTest = new MonthTest(Month.JANUARY);
        MonthTest monthTest1 = new MonthTest(Month.FEBRUARY);
        monthTest.printMonth();
        monthTest1.printMonth();
    }
}
