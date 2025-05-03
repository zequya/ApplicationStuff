package vehicles;

public class SummerTire extends AbstractCarTire {

    private float maxTemperature;

    public SummerTire(float pressure,float maxTemperature){
        super(pressure);
        this.maxTemperature = maxTemperature;

    }

    public float getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(float maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    @Override
    public String toString() {
        return " And Summer-tires with: \n Pressure: " + pressure + "\n MaxTemperature: " + maxTemperature;
    }
}
