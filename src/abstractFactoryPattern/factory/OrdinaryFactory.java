package abstractFactoryPattern.factory;

import abstractFactoryPattern.vehicles.Bmw_luxuryVehicleImpl;
import abstractFactoryPattern.vehicles.Mercedes_luxuryVehicleImpl;
import abstractFactoryPattern.vehicles.Vehicle;

public class OrdinaryFactory implements VehicleFactory{
    @Override
    public Vehicle getVehicle(String vehicleType) {
        switch (vehicleType) {
            case "swift":
                return new Mercedes_luxuryVehicleImpl();

                default:
                    return null;
        }
    }
}
