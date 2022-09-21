package CreationalPatterns.AbstractFactoryPattern;

public class FerrariFactory extends VehicleFactory {
    @Override
    public Jeep createJeep() {
        return new FerrariPurosangueJeep();
    }

    @Override
    public Car createCar() {
        return new FerrariRomaCar();
    }
}
