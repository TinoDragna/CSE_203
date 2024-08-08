public class Ship {
    private String name;
    private String yearBuilt;

    public Ship() {
        this.name = null;
        this.yearBuilt = null;
    }

    public Ship(String name, String yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }

    @Override
    public String toString() {
        return "Ship [name=" + name + ", yearBuilt=" + yearBuilt + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    

}
