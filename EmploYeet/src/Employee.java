public abstract class Employee {
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

    abstract double annualSalary();

    abstract double monthlySalary();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hireYear=" + hireYear +
                '}';
    }
}
