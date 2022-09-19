package AbstractFactory;

public class PorscheFactory extends VehicleFactory{
    @Override
    public Jeep createJeep() {
        return new PorscheCayenneJeep();
    }

    @Override
    public Car createCar() {
        return new Porsche911Car();
    }
}
