
public class Salary {

    private String code;
    private String name;
    private double income;

    public Salary() {
        this.code = null;
        this.name = null;
        this.income = 0;
    }

    public Salary(String code, String name, double income) {
        this.code = code;
        this.name = name;
        this.income = income;
    }

    public void print() {

    }
    
    @Override
    public String toString() {
        return "Salary [code=" + code + ", name=" + name + ", income=" + income + "]";
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getIncome() {
        return income;
    }


}
