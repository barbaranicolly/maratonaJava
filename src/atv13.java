import java.util.Scanner;
import java.util.Locale;
public class atv13 {
    public static void main(String[] args) {
    double X, Y;
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
     X = sc.nextDouble();
     Y = sc.nextDouble();
       if (X == 0.0 && Y == 0.0) {
         System.out.println("origem");
     } else if (X > 0 && Y > 0) {
         System.out.println("Q1");
     } else if (X < 0 && Y > 0) {
         System.out.println("Q2");
     } else if (X < 0 && Y < 0) {
         System.out.println("Q3");
     } else if (X > 0 && Y < 0) {
           System.out.println("Q4");
     } else if (X == 0) {
           System.out.println("eixo Y");
     } else if (Y ==0) {
           System.out.println("eixo X");


       }

     sc.close();
    }
}
