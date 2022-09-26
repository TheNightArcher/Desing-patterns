package Structuralpatterns.BridgePattern;

public class Square extends Shape {
    protected Square(Color color) {
        super(color);
    }

    @Override
    public void massage() {
        System.out.printf("The %s is ",Square.class.getSimpleName());
        color.applyColor();
        System.out.println();
    }
}
