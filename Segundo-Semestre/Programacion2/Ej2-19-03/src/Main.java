public class Main {
    public static void main(String[] args) {
        System.out.println();

        Account acc = new SavingsAccount(10000, 10);
        acc.consign(5000);
        System.out.println(acc.toString());
        acc.withdraw(2000);
        acc.monthlyStatement();
        System.out.println(acc.toString());

        Account acc1 = new CheckingAccount(10000, 10);
        acc1.consign(5000);
        System.out.println(acc1.toString());
        acc1.withdraw(20000);
        acc1.monthlyStatement();
        System.out.println(acc1.toString());
    }
}