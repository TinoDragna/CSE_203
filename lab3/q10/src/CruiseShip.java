public class CruiseShip extends Ship {
    private int maxPassengers;

    public CruiseShip() {
        super();
        this.maxPassengers = 0;
    }

    public CruiseShip(String name, String yearBuilt, int maxPassengers) {
        super(name, yearBuilt);
        this.maxPassengers = maxPassengers;
    }

    @Override
    public String toString() {
        return "CruiseShip [maxPassengers=" + maxPassengers + ", getName()=" + getName() + "]";
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    
}
