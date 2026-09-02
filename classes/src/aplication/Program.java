package aplication;
import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String [] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.println("name: ");
        emp.name = sc.nextLine();
        System.out.println("Gross salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.println("tax: ");
        emp.tax = sc.nextDouble();

        System.out.println("employee: " + emp);
        System.out.println();

        System.out.println("which percentage to increase salary: ");
        double percentage = sc.nextDouble();
        emp.increaseSalary(percentage);
        System.out.println();

        System.out.println("update data: " + emp);
        sc.close();
    }
}
