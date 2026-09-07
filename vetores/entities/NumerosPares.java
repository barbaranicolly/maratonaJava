package vetores.entities;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i=0;i< vect.length;i++){
            System.out.println("digite um numero: ");
            vect[i]= sc.nextInt();
        }
        int pares = 0;
        for (int i=0;i< vect.length;i++){
             if (vect[i] % 2 == 0){
                 System.out.println(vect[i]);
                 pares++;
             }
        }
        System.out.println("quantidade de pares: " + pares);
        sc.close();
    }
}
