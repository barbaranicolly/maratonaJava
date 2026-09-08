package vetores.entities;

import java.util.Scanner;

public class media_pares {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("quantos elementos vai ter o vetor? ");
        int vetor = sc.nextInt();

        int[] vect = new int[vetor];

        for (int i=0;i<vetor;i++){
            System.out.println("digite um numero: ");
            vect[i] = sc.nextInt();
        }
        int soma = 0;
        int quantidadePares =0;

        for (int i=0;i<vetor;i++){
            if (vect[i] % 2 == 0) {
                soma += vect[i];
                quantidadePares++;
            }
        }
        if (quantidadePares == 0){
            System.out.println("nenhum numero par");
        }
        else {
            double media = (double) soma / quantidadePares;
            System.out.println("media dos pares= " + media);
        }
        sc.close();
    }
}
