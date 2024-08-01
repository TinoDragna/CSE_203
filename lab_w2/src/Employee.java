

public class Employee {

    private String id;
    private String name;
    private int start;
    private double salaryCoefficient;
    private double increaseYearly;
    // private double income; // start, he so luong ban dau, he so tang hang nam ??

    public Employee() {
        this.id = null;
        this.name = null;
        this.start = 0;
        this.salaryCoefficient = 0;
        this.increaseYearly = 0;
    }

    public Employee(String id, String name, int start, double salaryCoefficient, double increaseYearly) {
        this.id = id;
        this.name = name;
        this.start = start;
        this.salaryCoefficient = salaryCoefficient;
        this.increaseYearly = increaseYearly;
    }

    public void print(double basicSalary, int now) {
        System.out.println("- Id: " + id);
        System.out.println("- Name: " + name);
        System.out.println("- Salary: " + getIncome(basicSalary, now));
    }

    public double getIncome(double basicSalary, int now) {
        int numOfYear = now - this.start;
        double salaryCoefficientFixed = this.salaryCoefficient + (this.increaseYearly * (double)numOfYear);
        double income = salaryCoefficientFixed * basicSalary;
        return income;
    }

    
    @Override
    public String toString() {
        return "Salary [id=" + id + ", name=" + name + ", start=" + start + ", salaryCoefficient="
                + salaryCoefficient + ", increaseYearly=" + increaseYearly + "]";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public double getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(double salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    public double getIncreaseYearly() {
        return increaseYearly;
    }

    public void setIncreaseYearly(double increaseYearly) {
        this.increaseYearly = increaseYearly;
    }

}
