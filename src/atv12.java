import java.util.Scanner;
import java.util.Locale;
public class atv12 {
    public static void main(String[] args) {
        double resp;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        resp = sc.nextDouble();
        if (resp >= 0 && resp <= 25) {
            System.out.println("intervalo [0, 25]");
        } else if (resp > 25 && resp <= 50) {
            System.out.println("intervalo (25, 50]");
        } else if (resp > 50 && resp <= 75) {
            System.out.println("intervalo (50, 75]");
        } else if (resp > 75 && resp <= 100) {
            System.out.println("intervalo (75, 100]");
        } else {
            System.out.println("fora de intervalo");
       sc.close();
        }
    }
}
