package CreationalPatterns.FactoryMethodPattern;

public class Main {
    public static void main(String[] args) {

        CarFactory car = new PorscheFactory();

        Car porsche = car.createCar();

        porsche.acceleration();
    }
}
