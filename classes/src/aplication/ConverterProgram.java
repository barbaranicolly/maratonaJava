package aplication;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class ConverterProgram {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("what is the dollar price? ");
        CurrencyConverter.DolarPrice = sc.nextDouble();
        System.out.println("how many dollar will be bought? ");
        CurrencyConverter.buying = sc.nextDouble();

        System.out.printf("amount to be paid in reals: %.2f%n" , CurrencyConverter.Tax());
    }
}
