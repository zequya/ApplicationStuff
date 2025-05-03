package vehicles;

public class VehicleFactory {

    public static Vehicle createCar(VehicleBrand vehicleBrand) {
        return new Car(vehicleBrand);
    }

    public static Vehicle createCarWithTire(VehicleBrand vehicleBrand, AbstractCarTire carTire) {
        return new Car(vehicleBrand, carTire);
    }

    public static Vehicle createMotorcycle(VehicleBrand vehicleBrand) {
        return new Motorcycle(vehicleBrand);
    }
}
