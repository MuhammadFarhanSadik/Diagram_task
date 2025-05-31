
package farhans.diagram_task;



    public class ATM {
    String location;
    Bank bank;

    public ATM(String location, Bank bank) {
        this.location = location;
        this.bank = bank;
    }

    public boolean validateCard(Card card) {
        for (Account account : bank.accounts) {
            if (account.customer.card.cardNumber == card.cardNumber &&
                account.customer.card.pin.equals(card.pin)) {
                return true;
            }
        }
        return false;
    }

    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }
}


