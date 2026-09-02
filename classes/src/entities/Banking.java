package entities;

public class Banking {
    private int accountNumber;
    private String name;
    private double balance;

    public Banking(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public Banking(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public void deposit(double deposit) {
        balance = balance + deposit;
    }

    public void saque(double saque) {
        balance = balance - saque - 5.00;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}