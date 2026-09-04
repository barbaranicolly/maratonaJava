package vetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("digite um numero: ");
            vect[i] = sc.nextInt();
        }
        double soma = 0.0;
            for (int i=0;i< vect.length;i++){
                soma += vect[i];
            }
        double media = soma / n;
        System.out.print("valores: ");
            for (int i=0;i< vect.length;i++){
                System.out.print(vect[i] + " ");
            }
        System.out.println();
        System.out.printf("soma: %.2f%n" , soma);
        System.out.printf("media: %.2f%n" , media);
            sc.close();
        }


    }
