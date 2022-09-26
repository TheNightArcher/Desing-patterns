package Structuralpatterns.BridgePattern;

public class Triangle extends Shape {
    protected Triangle(Color color) {
        super(color);
    }

    @Override
    public void massage() {
        System.out.printf("The %s is ",Triangle.class.getSimpleName());
        color.applyColor();
        System.out.println();
    }
}
