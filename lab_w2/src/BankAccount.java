
public class BankAccount {

    private int mAccount;
    private String mName;
    private double mBalance;

    public int getmAccount() {
        return mAccount;
    }

    public String getmName() {
        return mName;
    }

    public double getmBalance() {
        return mBalance;
    }

    public BankAccount() {
        this.mAccount = 0;
        this.mName = null;
        this.mBalance = 0;
    }

    public BankAccount(int mAccount, String mName, double mBalance) {
        this.mAccount = mAccount;
        this.mName = mName;
        this.mBalance = mBalance;
    }

    public void deposit(double amount) {
        mBalance += amount;
    }

    public boolean withdraw(double amount) {
        if (mBalance < amount + 50000) {
            System.out.println("insufficient money");
            return false;
        }
        mBalance -= amount;
        return true;
    }

    public boolean transferMoney(BankAccount another, double amount) {
        if (mBalance < amount + 50000) {
            System.out.println("insufficient money");
            return false;
        }
        mBalance -= amount;
        another.mBalance += amount;
        return true;
    }

    public void print() {
        System.out.println();
        String temp = "mAccount: " + mAccount + " mName: " + mName + " mBalance: " + mBalance;
        System.out.println(temp);
    }

    @Override
    public String toString() {
        return "BankAccount [mAccount=" + mAccount + ", mName=" + mName + ", mBalance=" + mBalance + "]";
    }

}
