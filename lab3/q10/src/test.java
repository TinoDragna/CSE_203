public class test {
    public static void main(String[] args) {
        Ship[] ships = new Ship[4];

        ships[0] = new Ship("s0", "2000");
        ships[1] = new CruiseShip("s1", "2020", 2000);
        ships[2] = new CargoShip("s2", "2010", 30000);
        ships[3] = new CruiseShip("s3", "2018", 4000);
        
        for (Ship ship : ships) {
            System.out.println(ship.toString());
        }
    }
}
