package abstractFactoryPattern;

import abstractFactoryPattern.factory.VehicleFactory;
import abstractFactoryPattern.factory.VehicleFactoryImpl;
import abstractFactoryPattern.vehicles.Bmw_luxuryVehicleImpl;
import abstractFactoryPattern.vehicles.Mercedes_luxuryVehicleImpl;
import abstractFactoryPattern.vehicles.Swift_OridnaryVehicleImple;
import abstractFactoryPattern.vehicles.Vehicle;

public class VehicleStore {
    public static void main(String[] args) {
        VehicleFactoryImpl vehicleFactory = new VehicleFactoryImpl("Luxury");
        VehicleFactory luxuryVehicleFactory = vehicleFactory.getVehicleFactory();

        Vehicle myveh = luxuryVehicleFactory.getVehicle("bmw");
        myveh.drive();

    }
}
