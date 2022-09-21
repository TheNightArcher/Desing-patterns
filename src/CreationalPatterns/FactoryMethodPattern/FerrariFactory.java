package CreationalPatterns.FactoryMethodPattern;

public class FerrariFactory extends CarFactory{
    @Override
    public Car createCar() {
        return new Ferrari();
    }
}
