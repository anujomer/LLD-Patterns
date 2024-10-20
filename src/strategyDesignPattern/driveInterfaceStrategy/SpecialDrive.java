package strategyDesignPattern.driveInterfaceStrategy;

public class SpecialDrive implements DriveInterface{
    @Override
    public void drive() {
        System.out.println("I'm a Drive for SpecialDrive");
    }
}
