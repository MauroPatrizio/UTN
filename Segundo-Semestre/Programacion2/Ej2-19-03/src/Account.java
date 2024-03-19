public abstract class Account {
    protected float balance;
    protected int numberConsignments = 0;
    protected int numberWithdrawals = 0;
    protected float annualRate;
    protected float monthlyFee = 0;

    public Account(float balance, float annualRate) {
        this.balance = balance;
        this.annualRate = annualRate;
    }

    public void consign(float amount){
        balance += amount;
        System.out.println("The new balance is " + balance);
        this.numberConsignments++;
    }

    public void withdraw(float amount){
        if (amount>0){
            if (amount<= balance ){
                balance-= amount;
                System.out.println("The new balance is " + balance);
                this.numberWithdrawals++;
            } else {
                System.out.println("Withdrawal error, your current balance is " + balance);
            }
        } else {
            System.out.println("You must enter an amount greater than 0");
        }
    }

    private void monthlyInterest(){
        float monthlyInterest = (this.balance * (this.annualRate / 100)) / 12;
        this.balance += monthlyInterest;
    }

    public void monthlyStatement() {
        this.balance -= this.monthlyFee;
        this.monthlyInterest();
    }

    @Override
    public String toString() {
        return "Account" +
                "balance=" + balance +
                ", numberConsignments=" + numberConsignments +
                ", numberWithdrawals=" + numberWithdrawals +
                ", annualRate=" + annualRate +
                ", monthlyFee=" + monthlyFee;
    }
}
