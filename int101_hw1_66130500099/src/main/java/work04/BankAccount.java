package work04;

import work04.Person;

public class BankAccount {

    private int number;
    private Person owner;
    private double balance;

    public BankAccount(int number, Person owner) {
        this.number = number;
        this.owner = owner;
    }

    public int getNumber() {
        return number;
    }
    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount) {
        balance -= amount;
        return balance;
    }

    public void transfer(double amount, BankAccount account) {
        withdraw(amount);
        account.deposit(amount);;

    }

    @Override
    public String toString() {
        return "BankAccount(" + number + ")";
    }
}
