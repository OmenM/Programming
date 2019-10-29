public class SalaryEmployee extends Employee{
    int annualSalary;
    boolean hasBenefits;

    SalaryEmployee(String name, int hireYear,int annualSalary){
        super(name, hireYear);
        this.annualSalary = annualSalary;


    }

}
