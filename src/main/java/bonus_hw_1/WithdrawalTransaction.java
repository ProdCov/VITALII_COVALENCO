package bonus_hw_1;

public class WithdrawalTransaction implements Transaction {
    private final BankAccount client;
    private final double sum;
    
    public WithdrawalTransaction(BankAccount client, double sum) {
        this.client = client;
        this.sum = sum;
    }
    
    @Override
    public void process() {
        client.accountWithdrawal(sum);
    }
}
