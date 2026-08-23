import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Locale;
public class atv14 {
    public static void main(String[] args) {
        double salario, novoSalario;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        salario = sc.nextDouble();
        if (salario <= 2000.00) {
            System.out.println("isento de impostos");
        } else if (salario > 2000.01 && salario <= 3000.00) {
        novoSalario = 1000.00 * 0.08;
        System.out.printf("R$: %.2f%n" ,  novoSalario);
        } else if (salario > 3000.00 && salario <= 4500.00) {
            novoSalario = (1000.00 * 0.08) + ((salario - 3000.00) * 0.18);
        System.out.printf("R$: %.2f%n" , novoSalario);
        } else if (salario > 4500.00) {
        novoSalario = (1000.00 * 0.08) + (1500.00 * 0.18) + ((salario - 4500.00) * 0.28);
            System.out.printf("R$: %.2f%n" , novoSalario);
        }

    }
    }
