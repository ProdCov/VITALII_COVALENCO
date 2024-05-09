package bonus_hw_1;

public class DepositTransaction implements Transaction {
    private final BankAccount client;
    private final double sum;
    
    public DepositTransaction(BankAccount client, double sum) {
        this.client = client;
        this.sum = sum;
    }
    
    @Override
    public void process() {
        client.accountDeposition(sum);
    }
}
