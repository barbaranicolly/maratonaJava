import java.util.Scanner;
import java.util.Locale;
public class atv4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int funcionario, horas;
        double valorH, salario;
        funcionario = sc.nextInt();
        horas = sc.nextInt();
        valorH = sc.nextDouble();
        salario = horas * valorH;
        System.out.println("number = " + funcionario);
        System.out.printf("salary = %.2f%n" , salario);

        sc.close();
    }
}
