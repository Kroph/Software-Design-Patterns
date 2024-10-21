public class RideTest {
    public static void main(String[] args) {
        RideContext rideContext = new RideContext();

        double test1 = rideContext.calculateFare(10, 15, false);
        System.out.println("Regular fare: $" + test1);

        double test2 = rideContext.calculateFare(10, 15, true);
        System.out.println("Surge fare: $" + test2);

        double test3 = rideContext.calculateFare(1, 2, false);
        System.out.println("Short ride fare: $" + test3);

        rideContext.setFareStrategy(new DiscountFareStrategy());
        double test4 = rideContext.calculateFare(5, 10, false);
        System.out.println("Discount fare: $" + test4);

        rideContext.setFareStrategy(new PremiumFareStrategy());
        double test5 = rideContext.calculateFare(8, 20, false);
        System.out.println("Premium fare: $" + test5);
    }
}