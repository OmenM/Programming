import java.util.ArrayList;

public class Main {
    public static ArrayList<HourlyEmployee> getHourlyEmployees(ArrayList<Employee> list) {
        ArrayList<HourlyEmployee> temp = new ArrayList<>();
        for (Employee o : list) {
            if (o instanceof HourlyEmployee) {
                temp.add((HourlyEmployee) o);
            }
        }
        return temp;
    }

    public static ArrayList<SalaryEmployee> getSalaryEmployees(ArrayList<Employee> list) {
        ArrayList<SalaryEmployee> temp = new ArrayList<>();
        for (Employee o : list) {
            if (o instanceof SalaryEmployee) {
                temp.add((SalaryEmployee) o);
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new SalaryEmployee("Johnny", 1996, 67000));
        employees.add(new PartTime("John", 1998, 12000, 1000));
        employees.add(new FullTime("K", 2012, 40, 16.95));
        System.out.println(getHourlyEmployees(employees));
    }
}
