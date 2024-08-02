public class shiftSupervisorTest {
    public static void main(String[] args) {
        ShiftSupervisor supervisor = new ShiftSupervisor("AAA", "1", "9/2010", 100, 20);
        System.out.println("before : "+supervisor);
        supervisor.setAnnualSalary(200);
        supervisor.setAnnualProductionBonus(50);
        System.out.println("after : "+ supervisor);
    }

}
