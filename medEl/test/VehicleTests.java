import org.junit.Test;
import vehicles.Car;
import vehicles.VehicleBrand;
import vehicles.VehicleFactory;


import static org.junit.jupiter.api.Assertions.*;

public class VehicleTests {

    @Test
    public void testCarInformation() {

        Car car = VehicleFactory.createCar(VehicleBrand.HONDA);
        assertEquals("Driving a car from Honda.", car.toString() );
    }
    
}
