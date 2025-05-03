import fittingShop.ShopSimulator;
import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.VehicleBrand;


public class Main {
    public static void main(String[] args) {

        Car car = new Car(VehicleBrand.KTM);
        //car.showInformation();

        Motorcycle motorcycle = new Motorcycle(VehicleBrand.KTM);
        //motorcycle.showInformation();

        ShopSimulator simulator = new ShopSimulator(4, 10);
        simulator.start();


    }
}