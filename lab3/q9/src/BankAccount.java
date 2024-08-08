public abstract class BankAccount {
    protected double balance; 
    protected int numOfDepositsThisMonth;
    protected int numOfWithdrawals;
    protected double interestRateAnnual;
    protected double monthlyServiceCharges;

    public BankAccount(double balance, int numOfDepositsThisMonth, int numOfWithdrawals, double interestRateAnnual,
            double monthlyServiceCharges) {
        this.balance = balance;
        this.numOfDepositsThisMonth = numOfDepositsThisMonth;
        this.numOfWithdrawals = numOfWithdrawals;
        this.interestRateAnnual = interestRateAnnual;
        this.monthlyServiceCharges = monthlyServiceCharges;
    }

        public BankAccount() {
        this.balance = 0;
        this.numOfDepositsThisMonth = 0;
        this.numOfWithdrawals = 0;
        this.interestRateAnnual = 0;
        this.monthlyServiceCharges = 0;
    }

    public void deposit(double amount){
            balance += amount;
            numOfDepositsThisMonth++;
    };

    public void  withdraw(double amount){
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            numOfWithdrawals++;
        } else {
            System.out.println("Error");
        }
    };

    public void calcInterest(){
        double interestRateMonthly = interestRateAnnual/12;
        double interestMonthly = balance*interestRateMonthly;
        balance = balance + interestMonthly;
    }

    public void monthlyProcess(){
        balance -= monthlyServiceCharges;
        calcInterest();
        numOfWithdrawals = 0;
        numOfDepositsThisMonth = 0;
        monthlyServiceCharges = 0;
    }

    @Override
    public String toString() {
        return "BankAccount [balance=" + balance + ", numOfDepositsThisMonth=" + numOfDepositsThisMonth
                + ", numOfWithdrawals=" + numOfWithdrawals + ", interestRateAnnual=" + interestRateAnnual
                + ", monthlyServiceCharges=" + monthlyServiceCharges + "]";
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNumOfDepositsThisMonth() {
        return numOfDepositsThisMonth;
    }

    public void setNumOfDepositsThisMonth(int numOfDepositsThisMonth) {
        this.numOfDepositsThisMonth = numOfDepositsThisMonth;
    }

    public int getNumOfWithdrawals() {
        return numOfWithdrawals;
    }

    public void setNumOfWithdrawals(int numOfWithdrawals) {
        this.numOfWithdrawals = numOfWithdrawals;
    }

    public double getInterestRateAnnual() {
        return interestRateAnnual;
    }

    public void setInterestRateAnnual(double interestRateAnnual) {
        this.interestRateAnnual = interestRateAnnual;
    }

    public double getMonthlyServiceCharges() {
        return monthlyServiceCharges;
    }

    public void setMonthlyServiceCharges(double monthlyServiceCharges) {
        this.monthlyServiceCharges = monthlyServiceCharges;
    };
    

}
