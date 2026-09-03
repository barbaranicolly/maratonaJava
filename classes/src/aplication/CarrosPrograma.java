package aplication;

import entities.Carros;

import java.util.Locale;
import java.util.Scanner;

public class CarrosPrograma {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("qual o modelo do carro? ");
        String modelo = sc.nextLine();

        System.out.print("qual o ano do carro? ");
        int ano = sc.nextInt();

        System.out.print("qual a quantidade de combustivel? ");
        double combustivel = sc.nextDouble();

        System.out.print("quanto voce quer abastecer? ");
        double abastecer = sc.nextDouble();

        Carros car = new Carros(modelo, ano, combustivel);
        car.abastacer(abastecer);
        System.out.println("dados cadastrados: ");
        System.out.println(car);

        System.out.println("quanto voce quer retirar de combustivel? ");
        double retirar = sc.nextDouble();
        car.retirar(retirar);
        System.out.println("dados atualizados:");
        System.out.println(car);

        sc.close();

    }
}