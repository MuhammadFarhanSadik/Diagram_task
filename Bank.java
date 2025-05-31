
package farhans.diagram_task;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    String name;
    List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }
}

