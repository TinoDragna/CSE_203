
import java.util.ArrayList;
import java.util.Scanner;

public class q2_bankAccount {

    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number of accounts: ");
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            System.out.println("Input infor for account " + i);
            System.out.println(" using the format 'accNum accName initBalance' ");
            String infor = sc.nextLine();
            String[] tokens = infor.split(" ");
            int accNum = Integer.parseInt(tokens[0]);
            String accName = tokens[1];
            double initBalance = Double.parseDouble(tokens[2]);
            BankAccount bankAccount = new BankAccount(accNum, accName, initBalance);
            accounts.add(bankAccount);
        }
        

        BankAccount origin = new BankAccount(0, "origin", 0);
        
        accounts.get(1).deposit(1000);
        accounts.get(2).transferMoney(origin, 100000);

        System.out.println("-----------------Accounts List----------------");
        for (BankAccount bankAccount : accounts) {
            System.out.println(bankAccount);
        }
        System.out.println(origin);


    }

}
