
package farhans.diagram_task;

public class Account {
    int accountNumber;
    double balance;
    Customer customer;

    public Account(int accountNumber, double balance, Customer customer) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customer = customer;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ". New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
