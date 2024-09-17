public class SavingsAcc extends Account {
    private String savingsAccount;

    public SavingsAcc(String savingsAccount, int id, int accountNumber, double balance) {
        super(id, accountNumber, balance);
        this.savingsAccount = savingsAccount;
    }

    public String getSavingsAcc() {
        return savingsAccount;
    }

    public void setSavingsAcc(String savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    public String getAccountType() {
        return "Savings Account";
    }
}
