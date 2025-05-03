package vehicles;

public class WinterTire extends AbstractCarTire {

    private float minTemperature;
    private float thickness;

    public WinterTire(float pressure, float minTemperature, float thickness) {
        super(pressure);
        this.minTemperature = minTemperature;
        this.thickness = thickness;
    }

    public float getMinTemperature() {
        return minTemperature;
    }

    public void setMinTemperature(float minTemperature) {
        this.minTemperature = minTemperature;
    }

    public float getThickness() {
        return thickness;
    }

    public void setThickness(float thickness) {
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return " And Winter-tires with: \n Pressure: " + pressure + "\n MinTemperature: " + minTemperature
                + " \n Thickness: " + thickness;
    }
}
