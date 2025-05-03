package vehicles;

public class VehicleFactory {

    public static Car createCar(VehicleBrand vehicleBrand) {
        return new Car(vehicleBrand);
    }

    public static Car createCarWithTire(VehicleBrand vehicleBrand, AbstractCarTire carTire) {
        return new Car(vehicleBrand, carTire);
    }

    public static Motorcycle createMotorcycle(VehicleBrand vehicleBrand) {
        return new Motorcycle(vehicleBrand);
    }
}
