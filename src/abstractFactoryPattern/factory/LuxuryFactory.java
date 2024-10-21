package abstractFactoryPattern.factory;

import abstractFactoryPattern.vehicles.Bmw_luxuryVehicleImpl;
import abstractFactoryPattern.vehicles.Mercedes_luxuryVehicleImpl;
import abstractFactoryPattern.vehicles.Vehicle;

public class LuxuryFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String vehicleType) {
        switch (vehicleType) {
            case "bmw":
                System.out.println("BMW Luxury Vehicle");
                return new Bmw_luxuryVehicleImpl();
            case "mercedes":
                return new Mercedes_luxuryVehicleImpl();
                default:
                    return null;
        }
    }
}
