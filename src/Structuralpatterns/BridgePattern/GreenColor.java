package Structuralpatterns.BridgePattern;

public class GreenColor implements Color {
    @Override
    public void applyColor() {
        System.out.print("green");
    }
}
