package vetores.entities;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String [] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i=0;i< vect.length;i++){
            System.out.println("digite o numero: ");
            vect[i]= sc.nextDouble();
        }
        double maior = vect[0];
        int posicao = 0;
        for (int i=1;i< vect.length;i++){
            if (vect[i] > maior) {
                maior = vect[i];
                posicao = i;
            }
        }
        System.out.println("maior valor: " + maior);
        System.out.println("posição do maior valor: " + posicao);
        sc.close();
    }
}
