package vehicles;

public abstract class AbstractVehicle implements Vehicle {


    protected VehicleBrand vehicleBrand;

    public AbstractVehicle(VehicleBrand vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    @Override
    public void showInformation() {
        System.out.println(toString());
    }


}
