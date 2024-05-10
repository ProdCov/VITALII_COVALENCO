package bonus_hw_1;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static final List<BankAccount> accountList = new ArrayList<>();
    
    
    public void addAccount(String name) {
        accountList.add(new BankAccount(name));
    }
    
    public void addAccount(BankAccount p) {
        accountList.add(p);
    }
    
    public void transaction(Transaction transaction) {
        transaction.process();
    }
    
    public void showInformation(String name) {
        for (BankAccount element :
                accountList) {
            if (element.getFullName().equals(name)) {
                element.checkBalance();
            }
        }
    }
    
    public void showAccounts() {
        for (BankAccount element :
                accountList) {
            System.out.println(element.toString());
        }
    }
}