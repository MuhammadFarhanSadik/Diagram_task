
package farhans.diagram_task;

public class Main {
    public static void main(String[] args) {
        // Create card
        Card card = new Card(123456, "4321");

        // Create customer
        Customer customer = new Customer("Farhan", card);

        // Create account and assign to customer
        Account account = new Account(101, 5000.0, customer);

        // Create bank and add account
        Bank bank = new Bank("Sonali Bank");
        bank.addAccount(account);

        // Create ATM
        ATM atm = new ATM("Dhaka", bank);

        // Simulate ATM usage
        if (atm.validateCard(card)) {
            System.out.println("Card validated successfully.");
            atm.withdraw(account, 2000.0); // Withdraw 2000
            account.deposit(1000.0);       // Deposit 1000
        } else {
            System.out.println("Invalid card.");
        }
    }
}
