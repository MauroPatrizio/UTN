public class CheckingAccount extends Account {
    protected float overdraft;

    public CheckingAccount(float balance, float annualRate) {
        super(balance, annualRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(float amount) {
        balance -= amount;
        if (balance < 0 ){
            overdraft += -(balance);
            balance = 0;
            System.out.println("The overdraft is " + overdraft);
        }
        System.out.println("The new balance is " + balance);
    }

    @Override
    public void monthlyStatement() {
        super.monthlyStatement();
    }

    @Override
    public String toString() {
        return "CheckingAccount" +
                "balance=" + balance +
                ", monthlyFee=" + monthlyFee +
                ", number of transactions=" + (numberConsignments + numberWithdrawals) +
                ", overdraft=" + overdraft;
    }
}
