public class test {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(0, 3, 6, 0, 0, false);

        account.deposit(300);
        account.withdraw(50);
        account.withdraw(80);
        account.deposit(10);

        account.print();

        account.withdraw(5);
        account.withdraw(5);
        account.withdraw(5);
        account.withdraw(5);
        account.withdraw(5);

        account.print();

        account.setMonthlyServiceCharges(5);
        account.monthlyProcess();

        account.print();
    }

}
