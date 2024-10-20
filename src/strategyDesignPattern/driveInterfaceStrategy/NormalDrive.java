package strategyDesignPattern.driveInterfaceStrategy;

public class NormalDrive implements DriveInterface{

    @Override
    public void drive() {
        System.out.println("NormalDrive");
    }
}
