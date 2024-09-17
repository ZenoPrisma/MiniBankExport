public class FixedTermsAcc extends Account {
    private String fixedTermsAccount;

    public FixedTermsAcc(String fixedTermsAccount, int id, int accountNumber, double balance) {
        super(id, accountNumber, balance);
        this.fixedTermsAccount = fixedTermsAccount;
    }

    public String getFixedTermsAcc() {
        return fixedTermsAccount;
    }

    public void setFixedTermsAcc(String fixedTermsAccount) {
        this.fixedTermsAccount = fixedTermsAccount;
    }

    public String getAccountType() {
        return "Fixed-Terms Account";
    }
}
