public class SalaryEmployee extends Employee{
    int annualSalary;
    boolean hasBenefits;

    SalaryEmployee(String name,boolean hasBenefits, int hireYear,int annualSalary){
        super(name, hireYear);
        this.annualSalary = annualSalary;
    }

    public SalaryEmployee(String name, int i, int i1) {

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
