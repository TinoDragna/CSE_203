import java.util.ArrayList;
import java.util.Scanner;
public class q3_salary {
    static Scanner sc = new Scanner(System.in);
    // test
    // 0 u0 100000 2014 2.34
    // 1 u1 100000 2010 2.34
    // 2 u2 200000 2014 2.34
    public static void main(String[] args) {

        System.out.println("Enter current year: ");
        int now = sc.nextInt();

        ArrayList<Salary> salaries = new ArrayList<>();

        System.out.println("numbers of employees: ");
        int N = sc.nextInt();
        sc.nextLine();
        System.out.println("form: code name basicSalary start salaryCoefficient");

        for (int i = 0; i < N; i++) {
            System.out.println("person "+i);
            String code = sc.next();
            String name = sc.next();
            double basicSalary = sc.nextDouble();

            int start = sc.nextInt();
            int numOfYear = numOfYear(start, now);
            double salaryCoefficient = sc.nextDouble();
            double income = income(salaryCoefficient, basicSalary, numOfYear);

            Salary salary = new Salary(code, name, income);
            salaries.add(salary);
        }

        System.out.println("----------------- List----------------");
        for (Salary salary: salaries) {
            System.out.println(salary);
        }
        
        System.out.println("person have the highest income is: "+getMaxIncome(salaries));
        
        for (int i = salaries.size()-1 ; i > -1 ; i--) {
            Salary salary = salaries.get(i);
            System.out.println(salary);
        }
    }

    public  static int numOfYear (int start, int now){
        return now - start;
    }
    public static double salaryCoefficientFixed(double salaryCoefficient, int numOfYear) {
          return (salaryCoefficient + 0.01 * numOfYear);
    }

    public static double income(double salaryCoefficient, double basicSalary, int numOfYear) {
        double salary = salaryCoefficientFixed(salaryCoefficient,numOfYear) * basicSalary;
        return salary;
    }

    public static Salary getMaxIncome (ArrayList<Salary> salaries ){
        Salary temp = salaries.get(0);
        for (int i = 0; i < salaries.size(); i++) {
            if(temp.getIncome()< salaries.get(i).getIncome())
            temp = salaries.get(i); 
        }
        return temp;
    }

}
