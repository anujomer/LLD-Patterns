package strategyDesignPattern.vehichles;

import strategyDesignPattern.driveInterfaceStrategy.DriveInterface;

public class Vehicle{
    private DriveInterface driveInterface;
    public Vehicle(DriveInterface driveInterface) {
        this.driveInterface = driveInterface;
    }

    public void drive() {
        driveInterface.drive();
    }
}
