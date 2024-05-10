package bonus_hw_1;

public class TransferOfFunds implements Transaction {
    private final BankAccount payer;
    private final BankAccount destination;
    private final double sum;
    
    public TransferOfFunds(BankAccount payer, BankAccount destination, double sum) {
        this.payer = payer;
        this.destination = destination;
        this.sum = sum;
    }
    
    @Override
    public void process() {
        if (payer.getAccountBalance() >= sum) {
            payer.accountWithdrawal(sum);
            destination.accountDeposition(sum);
        } else System.out.println("Payer doesn't have enough funds!");
    }
}