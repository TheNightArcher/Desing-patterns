package SingletonPattern;

public class Hotel {

    //create an object of Hotel.
    private static final Hotel hotel = new Hotel();

    //Make the constructor private so that this class cannot be instantiated.
    private Hotel() {
    }

    //Get the only object available
    public static Hotel washingTime() {
        return hotel;
    }

    public void noteMessage(){
        System.out.println("Guys share washing machine between you.");
    }
}
