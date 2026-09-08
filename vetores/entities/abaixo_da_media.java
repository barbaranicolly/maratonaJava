package vetores.entities;

import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        double[] vect = new double[n];
        double soma = 0;

        for (int i=0;i< vect.length; i++){
            System.out.println("digite um numero: ");
            vect[i]= sc.nextDouble();
            soma += vect[i];
        }
        double media = soma / n;
        System.out.println("media do vetor: " + media);
        System.out.println("elenentos abaixo da media: ");
        for (int i=0;i< vect.length;i++) {
            if (vect[i] < media) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
