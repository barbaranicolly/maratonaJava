import java.util.Scanner;
import java.util.Locale;
public class atv20 {
    public static void main(String [] args) {
        double resultado;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=0; i<N; i++) {
            double A = sc.nextDouble();
            double B = sc.nextDouble();
       if (B != 0) {
           resultado = (A / B);
           System.out.println(resultado);
       } else if (B == 0) {
           System.out.println("divisao impossivel");
       }

            }
        sc.close();
        }
    }
