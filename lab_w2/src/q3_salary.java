
import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;

public class q3_salary {
    static StringBuilder sb = new StringBuilder();
    static Scanner sc = new Scanner(System.in);

    // test
    // 0 u0 2014 2.34
    // 1 u1 2010 2.34
    // 2 u2 2019 2.34
    public static void main(String[] args) {
        int now = Year.now().getValue();
        double basicSalary = 5000000;
        double increaseYearly = 0.1;

        System.out.println("Current year: " + now);
        System.out.println("Basic salary: " + basicSalary);
        System.out.println("Salary coefficient increase yearly: " + increaseYearly);

        ArrayList<Employee> employees = new ArrayList<>();

        System.out.println("numbers of employees: ");
        int N = sc.nextInt(); //3
        sc.nextLine();
        System.out.println("form: id   name   start   salaryCoefficient");

        for (int i = 0; i < N; i++) {
            System.out.println("person " + (i+1));
            String id = sc.next();
            String name = sc.next();
            int start = sc.nextInt();
            double salaryCoefficient = sc.nextDouble();

            Employee employee = new Employee(id, name, start, salaryCoefficient, increaseYearly);
            employees.add(employee);
        }

        System.out.println("----------------- List----------------");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        employees.sort((s1, s2) -> {
            return Double.compare(s2.getIncome(basicSalary, now), s1.getIncome(basicSalary, now));
        });

        for (int i = 0 ; i <employees.size() ; i++) {
            Employee employee = employees.get(i);
            sb = sb.append(employee).append("income ="+employee.getIncome(basicSalary, now)).append("\n");  
        }
        System.out.println(sb);
    }

}
