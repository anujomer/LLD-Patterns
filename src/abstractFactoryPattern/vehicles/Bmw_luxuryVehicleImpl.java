package abstractFactoryPattern.vehicles;

public class Bmw_luxuryVehicleImpl implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Bmw luxury vehicle drive");
    }
}
