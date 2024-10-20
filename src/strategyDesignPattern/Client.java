package strategyDesignPattern;

import strategyDesignPattern.vehichles.NormalVehicle;
import strategyDesignPattern.vehichles.SpecialVehicle;
import strategyDesignPattern.vehichles.Vehicle;

public class Client {
    public static void main(String[] args) {
        Vehicle nv = new NormalVehicle();
        nv.drive();
        Vehicle sv = new SpecialVehicle();
        sv.drive();


    }
}
