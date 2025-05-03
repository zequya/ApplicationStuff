package vehicles;

public abstract class AbstractCarTire {

    protected float pressure;

    public AbstractCarTire(float pressure){
        this.pressure = pressure;
    }


    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }


}
