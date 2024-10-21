package abstractFactoryPattern.factory;

import abstractFactoryPattern.vehicles.Vehicle;

public interface VehicleFactory {
    Vehicle getVehicle(String type);
}
