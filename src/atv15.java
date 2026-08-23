import java.util.Scanner;
import java.util.Locale;
public class atv15 {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        double conta = 50.0;
        if (min > 100){
            conta += (min - 100) * 2.00; }
            System.out.printf("valor a pagar: %.2f%n" , conta);

        sc.close();
    }
}
