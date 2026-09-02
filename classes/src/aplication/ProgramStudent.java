package aplication;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudent {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("name: ");
        String name = sc.nextLine();
        System.out.println("grade 1: ");
        double grade1 = sc.nextDouble();
        System.out.println("grade 2 :");
        double grade2 = sc.nextDouble();
        System.out.println("grade 3: ");
        double grade3 = sc.nextDouble();

        Student stu = new Student(name, grade1, grade2, grade3);

        System.out.println("Final grade: " + stu.notaFinal());
        System.out.println(stu.PassOrFailed());
        if (stu.notaFinal() < 60.0){
        System.out.println("missing: " + stu.ifFailed() + " points");
        }

        }

    }

