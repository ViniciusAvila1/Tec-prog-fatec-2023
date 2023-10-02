package exercises_23_09_2023.exercise06;

public class CalculatorSalary {

    private double SalaryValue;
    private double Aliquot;
    private double Deduction;

    public double getSalaryValue() {
        return SalaryValue;
    }
    public void setSalaryValue(double SalaryValue) {
        this.SalaryValue = SalaryValue;
    }
    public double getAliquot() {
        return Aliquot;
    }
    public void setAliquot(double aliquot) {
        this.Aliquot = aliquot;
    }
    public double getDeduction() {
        return Deduction;
    }
    public void setDeduction(double deduction) {
        this.Deduction = deduction;
    }

}