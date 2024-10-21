import java.time.LocalTime;

public class RideContext {
    private FareStrategy fareStrategy;
    private static final double MINIMUM_FARE = 5.0;

    public void setFareStrategy(FareStrategy fareStrategy) {
        this.fareStrategy = fareStrategy;
    }

    public double calculateFare(double distanceKm, double durationMinutes, boolean isPeakHour) {
        if (distanceKm < 0 || durationMinutes < 0) {
            throw new IllegalArgumentException("Distance and duration cannot be negative.");
        }

        if (isPeakHour) {
            setFareStrategy(new SurgeFareStrategy());
        } 
        else {
            setFareStrategy(new RegularFareStrategy());
        }

        double fare = fareStrategy.calculateFare(distanceKm, durationMinutes);

        return Math.max(fare, MINIMUM_FARE);
    }

    public boolean isPeakHour(LocalTime currentTime) {
        // Peak hours 6:00 to 9:00 and 17:00 to 20:00
        return (currentTime.isAfter(LocalTime.of(6, 0)) && currentTime.isBefore(LocalTime.of(9, 0)))
            || (currentTime.isAfter(LocalTime.of(17, 0)) && currentTime.isBefore(LocalTime.of(20, 0)));
    }
}