package Structuralpatterns.AdaptorPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle porsche911 = new Porsche911();

        SpeedAdaptor speedAdaptor = new SpeedAdaptor(porsche911);

        System.out.printf("%.2f km %n", porsche911.getSpeed());
        System.out.printf("%.2f mph", speedAdaptor.getSpeed());
    }
}
