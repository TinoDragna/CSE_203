public class ProductionWorker extends Employee{

    private int shift;
    private double hourPayRate;

    public ProductionWorker(String name, String id, String hireDay, int shift, double hourPayRate) {
        super(name, id, hireDay);
        this.shift = shift;
        this.hourPayRate = hourPayRate;
    }

    public String shiftMode (){
        String mode = null;
        if (shift ==1){
            mode = "the day";
        } else if (shift == 0){
            mode = "the night";
        }
        return mode;
    }

    @Override
    public String toString() {
        return "ProductionWorker [shift=" + shift + ", hourPayRate=" + hourPayRate + "]";
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getHourPayRate() {
        return hourPayRate;
    }

    public void setHourPayRate(double hourPayRate) {
        this.hourPayRate = hourPayRate;
    }

    
}
