package bonus_hw_1;

public class BankAccount {
    protected static long num = 22500000000L;
    public String fullName;
    public float accountBalance;
    public long accountNumber;
    
    public BankAccount(String fullName) {
        this.accountNumber = num;
        num++;
        this.fullName = fullName;
    }
    
    protected float getAccountBalance() {
        return accountBalance;
    }
    
    public String getFullName() {
        return fullName;
    }
    
    protected double getAccountNumber() {
        return accountNumber;
    }
    
    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", fullName='" + fullName + '\'' +
                ", accountBalance=" + accountBalance +
                '}';
    }
    
    public void accountDeposition(double x) {
        if (x >= 0) {
            accountBalance += (float) x;
        } else System.out.println("Incorrect sum for deposition!");
    }
    
    public void accountWithdrawal(double x) {
        if (x > accountBalance) {
            System.out.println("Insufficient funds on account number: " + this.accountNumber);
        } else accountBalance -= (float) x;
    }
    
    public void checkBalance() {
        System.out.println("Your account balance is: " + getAccountBalance());
    }
}
