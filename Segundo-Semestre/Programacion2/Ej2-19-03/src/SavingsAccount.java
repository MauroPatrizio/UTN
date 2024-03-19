public class SavingsAccount extends Account{
    protected boolean active;

    public SavingsAccount(float balance, float annualRate) {
        super(balance, annualRate);
        this.active = balance >= 10000;
    }

    @Override
    public void consign(float amount) {
        if (this.active){
           super.consign(amount);
        } else {
            System.out.println("The account must be active to deposit");
        }
    }

    @Override
    public void withdraw(float amount) {
        if (active){
            super.withdraw(amount);
        } else {
            System.out.println("The account must be active to withdraw");
        }
    }

    public void monthlyExtract(){
        if(this.numberConsignments>4){
            this.monthlyFee += 1000;
        }
    }
    @Override
    public String toString() {
        return "SavingsAccount" +
                ", balance=" + balance +
                ", monthlyFee=" + monthlyFee +
                ", number of transactions=" + (numberConsignments + numberWithdrawals);
    }
}
