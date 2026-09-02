package aplication;
import entities.Banking;

import java.util.Locale;
import java.util.Scanner;

public class bankingProgram {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.println("enter account holder: ");
        String name = sc.nextLine();

        System.out.println("is there a initial deposit? [Y/N]: ");
        String resp = sc.nextLine();

        double deposit;
        Banking bank = new Banking(accountNumber, name);
        if (resp.equals("y")) {
            System.out.println("enter inicial deposit value: ");
            deposit = sc.nextDouble();
            bank.deposit(deposit);
        }
        System.out.println("account data: ");
        System.out.printf("account: " + accountNumber + ", name: " + name + ", balance: %.2f" , bank.getBalance());
        System.out.println();
        System.out.println("enter a deposit value: ");
        deposit = sc.nextDouble();
        bank.deposit(deposit);
        System.out.printf("account: " + accountNumber + ", name: " + name + ", balance: %.2f" , bank.getBalance());
        System.out.println();

        System.out.println("enter a withdraw value: ");
        double saque = sc.nextDouble();
        bank.saque(saque);
        System.out.printf("account: " + accountNumber + ", name: " + name + ", balance: %.2f" , bank.getBalance());
        sc.close();
        }
}
