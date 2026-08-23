import java.util.Scanner;
import java.util.Locale;
public class atv5 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigo1, quantidade1;
        int codigo2, quantidade2;
        double valor1, valor2;
        double total1, total2, total;
        codigo1 = sc.nextInt();
        quantidade1 = sc.nextInt();
        valor1 = sc.nextDouble();
        codigo2 = sc.nextInt();
        quantidade2 = sc.nextInt();
        valor2 = sc.nextDouble();
        total1 = quantidade1 * valor1;
        total2 = quantidade2 * valor2;
        total = total1 + total2;
        System.out.printf("total a pagar: %.2f%n" , total);
sc.close();
    }
}
