package Structuralpatterns.AdaptorPattern;

public class SpeedAdaptor implements Vehicle {
    private Vehicle superCar;

    public SpeedAdaptor() {
    }

    public SpeedAdaptor(Vehicle superCar) {
        this.superCar = superCar;
    }

    @Override
    public double getSpeed() {
        return convertKMToMPH(superCar.getSpeed());
    }

    private double convertKMToMPH(double km) {
        return km * 0.6214;
    }
}
