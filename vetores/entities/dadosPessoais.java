package vetores.entities;

import java.util.Locale;
import java.util.Scanner;

public class dadosPessoais {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        sc.nextLine();

        double[] altura = new double[n];
        char[] sexo = new char[n];

    for (int i=0;i<n;i++){
        System.out.println("altura da " + (i + 1) + "pessoa: ");
        altura[i] = sc.nextDouble();
        sc.nextLine();
        System.out.println("genero da " + (i + 1) + "pessoa: ");
        sexo[i] = sc.next().toUpperCase().charAt(0);
    }
    double maiorAltura = 0;
    double menorAltura = altura[0];
    for (int i=0;i<n;i++){
        if (altura[i] > maiorAltura){
            maiorAltura = altura[i];
        }
        if (altura[i] < menorAltura){
            menorAltura = altura[i];
    }
    }

    double somaMulheres = 0;
    int quantidadeHomens = 0;
    int quantidadeMulheres = 0;
    for (int i=0;i<n;i++){
        if (sexo[i] == 'F'){
            somaMulheres += altura[i];
            quantidadeMulheres++;
        }
        if (sexo[i] == 'M'){
            quantidadeHomens++;
        }
    }
    double mediaMulheres = somaMulheres / quantidadeMulheres;
        System.out.println("maior altura: " + maiorAltura);
        System.out.println("menor altura: " + menorAltura);
        System.out.printf("media das alturas das mulheres: %.2f%n" , mediaMulheres);
        System.out.println("quantidade de homens: " + quantidadeHomens);
    sc.close();
    }
}
