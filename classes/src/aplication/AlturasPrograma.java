package aplication;

import entities.Alturas;

import java.util.Locale;
import java.util.Scanner;

public class AlturasPrograma {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

            System.out.println("quantas pessoas serao digitadas? ");
            int n = sc.nextInt();
            Alturas[] vetor = new Alturas[n];
            int menores = 0;
            double soma = 0;
        for (int i=0;i<n;i++){
            System.out.println("dados da " + (i + 1) + "pessoa:"  );
            System.out.println("nome: ");
            String nome = sc.nextLine();
            sc.nextLine();


            System.out.println("idade: ");
            int idade = sc.nextInt();

            System.out.println("altura: ");
            double altura = sc.nextDouble();
            vetor[i] = new Alturas(nome, idade, altura);
            soma += vetor[i].getAltura();
        }
        for (int i=0;i<n;i++){
            if (vetor[i].getIdade() < 16){
                menores++;
                System.out.println(vetor[i].getNome());
            }
        }
        double media = soma / n;
        System.out.println("altura media: " + media);
        System.out.println("pessoas com menores de 16 anos: " + menores);
    }
}
