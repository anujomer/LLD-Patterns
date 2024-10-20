package strategyDesignPattern.vehichles;

import strategyDesignPattern.driveInterfaceStrategy.NormalDrive;

public class NormalVehicle extends Vehicle {
    public NormalVehicle() {
        super(new NormalDrive());
    }
}
