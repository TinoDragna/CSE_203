public class CargoShip extends Ship{
    private int cargoCapacityInTonnage;

    public CargoShip() {
        super();
        this.cargoCapacityInTonnage = 0;
    }

    public CargoShip(String name, String yearBuilt, int cargoCapacityInTonnage) {
        super(name, yearBuilt);
        this.cargoCapacityInTonnage = cargoCapacityInTonnage;
    }

    @Override
    public String toString() {
        return "CargoShip [cargoCapacityInTonnage=" + cargoCapacityInTonnage + ", getName()=" + getName() + "]";
    }

    public int getCargoCapacityInTonnage() {
        return cargoCapacityInTonnage;
    }

    public void setCargoCapacityInTonnage(int cargoCapacityInTonnage) {
        this.cargoCapacityInTonnage = cargoCapacityInTonnage;
    }
    

}
