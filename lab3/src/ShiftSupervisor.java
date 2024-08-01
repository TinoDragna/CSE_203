public class ShiftSupervisor extends Employee{

    private double annualSalary;
    private double annualProductionBonus;

    public ShiftSupervisor(String name, String id, String hireDay, double annualSalary, double annualProductionBonus) {
        super(name, id, hireDay);
        this.annualSalary = annualSalary;
        this.annualProductionBonus = annualProductionBonus;
    }

    @Override
    public String toString() {
        return "ShiftSupervisor [annualSalary=" + annualSalary + ", annualProductionBonus=" + annualProductionBonus
                + "]";
    }


    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualProductionBonus() {
        return annualProductionBonus;
    }

    public void setAnnualProductionBonus(double annualProductionBonus) {
        this.annualProductionBonus = annualProductionBonus;
    }

}
