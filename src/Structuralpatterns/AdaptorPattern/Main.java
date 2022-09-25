package Structuralpatterns.AdaptorPattern;

public class Main {
    public static void main(String[] args) {

        USB usb = new USB("Dangers women");
        CassetteTape cassetteTape = new CassetteTape("Rear");

        CarWithCassetteTapesRadio car = new AdaptorWithUSBPort(cassetteTape);

    }
}
