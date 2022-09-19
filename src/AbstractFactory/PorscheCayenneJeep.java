package AbstractFactory;

public class PorscheCayenneJeep implements Jeep{
    @Override
    public void wheelDrive() {
        System.out.println("RWD");
    }
}
