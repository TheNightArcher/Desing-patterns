package Structuralpatterns.BridgePattern;

public class Main {
    public static void main(String[] args) {
        Color red = new RedColor();
        Shape triangle = new Triangle(red);
        triangle.massage();

        Color green = new GreenColor();
        Shape square = new Square(green);
        square.massage();
    }
}
