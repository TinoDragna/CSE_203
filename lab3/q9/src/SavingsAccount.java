
public class SavingsAccount extends BankAccount {

    private boolean isActive;

    public SavingsAccount() {
        super();
        this.isActive = balance>=25 ;
    }

    public SavingsAccount(double balance, int numOfDepositsThisMonth, int numOfWithdrawals, double interestRateAnnual,
            double monthlyServiceCharges, boolean isActive) {
        super(balance, numOfDepositsThisMonth, numOfWithdrawals, interestRateAnnual, monthlyServiceCharges);
        this.isActive = isActive == balance>=25;
    }

    public void status(double balance) {
        if (balance < 25) {
            isActive = false;
        }
        isActive = true;
    }

    @Override
    public void withdraw(double amount) {
        if (isActive) {
            super.withdraw(amount);
            status(balance);
        } else {
            System.out.println("inactive!");
        }
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        status(balance);
    }

    @Override
    public void monthlyProcess() {
        if (getNumOfWithdrawals() > 4) {
            double extraWithdrawals = getNumOfWithdrawals() - 4;
            setMonthlyServiceCharges(getMonthlyServiceCharges() + extraWithdrawals);
        }
        super.monthlyProcess();
        status(balance);
        System.out.println("calculated monthly process");
    }

    @Override
    public String toString() {
        return "SavingsAccount [isActive=" + isActive + "]";
    }

    public void print(){
        System.out.println("Balance: " + getBalance());
        System.out.println("Number of deposits: " + getNumOfDepositsThisMonth());
        System.out.println("Number of withdrawals: " + getNumOfWithdrawals());
        System.out.println("Monthly service charges: " + getMonthlyServiceCharges());
        System.out.println("Account is active: " + isActive()+"\n");
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

}
