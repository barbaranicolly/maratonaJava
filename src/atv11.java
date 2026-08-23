import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class atv11 {
    public static void main(String [] args){
      int resp, quantidade;
      double valor;
        Scanner sc = new Scanner(System.in);
         resp = sc.nextInt();
         quantidade = sc.nextInt();
          if (resp == 1) {
              valor = quantidade * 4.00;
          } else if (resp == 2) {
              valor = quantidade * 4.50;
          } else if ( resp == 3) {
              valor = quantidade * 5.00;
          } else if (resp == 4) {
              valor = quantidade * 2.00;
          } else if (resp == 5) {
              valor = quantidade * 1.50;
          } else {
              valor = 0.0;
          }
        System.out.printf("total %.2f%n" , valor);

        sc.close();
    }
}
