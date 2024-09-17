public class CheckingAcc extends Account {
    private String checkingAccount;

    public CheckingAcc(String checkingAccount, int id, int accountNumber, double balance) {
        super(id, accountNumber, balance);
        this.checkingAccount = checkingAccount;
    }

    //Getter & Setter
    public String getCheckingAcc() {
        return checkingAccount;
    }

    public void setCheckingAcc(String checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    public String getAccountType() {
        return "Checking Account";
    }
}
