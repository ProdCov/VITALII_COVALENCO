package bonus_hw_1;

public class Main {
    
    public static void main(String[] args) {
        BankAccount p1 = new BankAccount("Ivanov Ivan");
        BankAccount p2 = new BankAccount("Petrov Piotr");
        BankAccount p3 = new BankAccount("Baluta Oxana");
        BankAccount p4 = new BankAccount("Fiodorov Valerii");
        BankAccount p5 = new BankAccount("Supac Stepan");
        Bank MAIB = new Bank();
        MAIB.addAccount(p1);
        MAIB.addAccount(p2);
        MAIB.addAccount(p3);
        MAIB.addAccount(p4);
        MAIB.addAccount(p5);
        MAIB.showAccounts();
        MAIB.transaction(new DepositTransaction(p4, 3333));
        MAIB.transaction(new DepositTransaction(p2, 17000));
        MAIB.transaction(new DepositTransaction(p1, 13000));
        MAIB.transaction(new DepositTransaction(p5, 3987));
        System.out.println("-------------------");
        MAIB.transaction(new TransferOfFunds(p4, p5, 2667));
        MAIB.transaction(new WithdrawalTransaction(p3, 500));
        MAIB.transaction(new WithdrawalTransaction(p2, 10030.31));
        MAIB.transaction(new WithdrawalTransaction(p5, 654));
        MAIB.transaction(new WithdrawalTransaction(p1, 9860));
        MAIB.showAccounts();
        MAIB.transaction(new TransferOfFunds(p3, p1, 10));
        
    }
}
