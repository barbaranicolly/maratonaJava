import java.util.Scanner;
public class atv7 {
    public static void main(String[] args){
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o numero: ");
        numero = sc.nextInt();
        if (numero < 0) {
            System.out.println("negativo");
        } else {
            System.out.println("nao negativo");
        }
        sc.close();
    }
}
