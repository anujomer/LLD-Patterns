package abstractFactoryPattern.factory;

public class VehicleFactoryImpl {

    private VehicleFactory vh;

    public VehicleFactoryImpl(String factoryType)
    {
        System.out.println("Factory Type: " + factoryType);

        switch (factoryType){
            case "Luxury":
                System.out.println("Luxury");
                this.vh = new LuxuryFactory();
                break;

            case "Ordinary":
                this.vh = new OrdinaryFactory();
                break;
        }
    }
    public VehicleFactory getVehicleFactory() {
        return this.vh;
    }
}
