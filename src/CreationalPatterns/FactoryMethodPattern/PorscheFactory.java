package CreationalPatterns.FactoryMethodPattern;

public class PorscheFactory extends CarFactory{
    @Override
    public Car createCar() {
        return new Porsche();
    }
}
