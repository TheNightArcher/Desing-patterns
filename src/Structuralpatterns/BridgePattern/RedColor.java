package Structuralpatterns.BridgePattern;

public class RedColor implements Color{
    @Override
    public void applyColor() {
        System.out.print("red");
    }
}
