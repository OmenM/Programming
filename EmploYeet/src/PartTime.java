public class PartTime extends HourlyEmployee{
    boolean hasBenefits;

    PartTime(String name, int hireYear, double annualSalary, double monthlySalary){
        super(name, hireYear, annualSalary, monthlySalary);

    }

    public boolean isHasBenefits() {
        return hasBenefits;
    }


    double annualSalary() {
        return 0;
    }

    double monthlySalary() {
        return 0;
    }
}
