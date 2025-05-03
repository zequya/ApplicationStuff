package vehicles;

public class Car extends AbstractVehicle {

    private AbstractCarTire carTire;

    public Car(VehicleBrand vehicleBrand) {
        super(vehicleBrand);
        this.carTire = new SummerTire(2.5f,50.0f);
    }

    public Car(VehicleBrand vehicleBrand, AbstractCarTire carTire) {
        super(vehicleBrand);
        this.carTire = carTire;
    }

    public AbstractCarTire getCarTire() {
        return carTire;
    }

    public void changeTire(AbstractCarTire carTire) {
        this.carTire = carTire;
    }

    @Override
    public String toString() {
        return "Driving a car from " + vehicleBrand + ".";
    }

    @Override
    public void showInformation() {
        System.out.println(toString());
        System.out.println(carTire.toString());
    }
}
