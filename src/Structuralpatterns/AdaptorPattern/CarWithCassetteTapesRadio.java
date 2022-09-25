package Structuralpatterns.AdaptorPattern;

public class CarWithCassetteTapesRadio {
    private CassetteTape cassetteTape;

    public CarWithCassetteTapesRadio(CassetteTape cassetteTape) {
        this.cassetteTape = cassetteTape;
    }

    public void playMusic(CassetteTape cassetteTape) {
        System.out.println(cassetteTape.getName());
    }

    public CassetteTape getCassetteTape() {
        return cassetteTape;
    }

    public void setCassetteTape(CassetteTape cassetteTape) {
        this.cassetteTape = cassetteTape;
    }
}
