public class FullTime extends HourlyEmployee{
    boolean hasBenefits;

    FullTime(String name, int hireYear, double hoursPerWeek, double hourlyWage) {
        super(name, hireYear, hoursPerWeek, hourlyWage);
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
