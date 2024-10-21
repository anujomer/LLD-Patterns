package abstractFactoryPattern.vehicles;

public class Mercedes_luxuryVehicleImpl implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Mercedes_luxuryVehicleImpl.drive()");
    }
}
