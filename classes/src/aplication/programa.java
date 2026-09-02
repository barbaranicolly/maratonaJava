package aplication;

import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class programa {
    public static void main(String [] args) {
    Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);
        System.out.println("enter rectangle width and height: ");
        double width = sc.nextDouble();
        double height = sc.nextDouble();
        Rectangle rect = new Rectangle(width, height);

        System.out.printf("area: %.2f%n", rect.area());
        System.out.printf("perimeter: %.2f%n" , rect.perimeter());
        System.out.printf("diagonal: %.2f%n" , rect.diagonal());

    sc.close();
    }
}
