package exercises_23_09_2023.exercise06;

import java.util.Scanner;

public class CalculatorINSS {

    public static void main(String[] args) {

        CalculatorSalary calc = new CalculatorSalary();
        Scanner reader = new Scanner(System.in);

        System.out.print("Insert the salary: ");
        int SalaryValue = reader.nextInt();

        calc.setSalaryValue(SalaryValue);

        double totalINSS = 0D;

        // definindo valores da tabela
        if (calc.getSalaryValue() > 0 && calc.getSalaryValue() < 1212) {
            calc.setAliquot(0.75);
            calc.setDeduction(0);

        }
        if (calc.getSalaryValue() > 1212 && calc.getSalaryValue() < 2427.35) {
            calc.setAliquot(0.09);
            calc.setDeduction(18.18);

        }
        if (calc.getSalaryValue() > 2427.35 && calc.getSalaryValue() < 3641.03) {
            calc.setAliquot(0.12);
            calc.setDeduction(91);

        }
        if (calc.getSalaryValue() > 3641.04 && calc.getSalaryValue() < 7087.22) {
            calc.setAliquot(0.14);
            calc.setDeduction(163.82);
        }

        totalINSS = (calc.getSalaryValue() * calc.getAliquot()) - calc.getDeduction();

        System.out.println("##########################\n");
        System.out.println("CALCULADORA DE INSS\n");
        System.out.println("##########################\n");
        System.out.println("Salario Bruto...: " + SalaryValue);
        System.out.println("Aliquota INSS...:" + calc.getAliquot() * 100D);
        System.out.println("Desconto INSS...: " + totalINSS);
        System.out.println("Salario liquido...:" + (SalaryValue - totalINSS));
    }
}