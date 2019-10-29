public class Employee {
    public String name;
    public int hireYear;

    Employee(String name,int hireYear){
        this.name = name;
        this.hireYear = hireYear;
    }
    public Employee(){
        name = "Adebowale";
        hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public int getHireYear() {
        return hireYear;
    }

    public double annualSalary(){
        return 12;
    }
    public double monthlySalary(){
        return 72;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hireYear=" + hireYear +
                '}';
    }
}
