package vehicles;

public class Motorcycle extends AbstractVehicle {


    public Motorcycle(VehicleBrand vehicleBrand) {
        super(vehicleBrand);
    }


    @Override
    public String toString() {
        return "Driving a motorcycle from " + vehicleBrand + ".";
    }



}
