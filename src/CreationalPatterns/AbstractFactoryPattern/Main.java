package CreationalPatterns.AbstractFactoryPattern;

public class Main {
    public static void main(String[] args) {
        VehicleFactory porsche = new PorscheFactory();

        Car carPorsche = porsche.createCar();
        carPorsche.horsePower();

        Jeep jeepPorsche = porsche.createJeep();
        jeepPorsche.wheelDrive();
    }
}
