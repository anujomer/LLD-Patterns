package strategyDesignPattern.vehichles;

import strategyDesignPattern.driveInterfaceStrategy.SpecialDrive;

public class SpecialVehicle extends Vehicle {
    public SpecialVehicle() {
        super(new SpecialDrive());
    }
}
