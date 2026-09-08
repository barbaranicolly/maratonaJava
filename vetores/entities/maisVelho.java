package vetores.entities;

import java.util.Scanner;

public class maisVelho {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[n];
        int[] idade = new int[n];

        for (int i=0;i<n;i++){
            System.out.println("dados da " + (i + 1) + "a pessoa: ");

            System.out.print("nome: ");
            nomes[i] = sc.nextLine();

            System.out.print("idade: ");
            idade[i] = sc.nextInt();

            sc.nextLine();
        }
        int maiorIdade = 0;
        int posicaoMaior = 0;
        for (int i=0;i<n;i++){
            if (idade[i] > maiorIdade)  {
                maiorIdade = idade[i];
                posicaoMaior = i; }
            }
        System.out.println("pessoa mais velha: " + nomes[posicaoMaior]);
        sc.close();
            }
        }
