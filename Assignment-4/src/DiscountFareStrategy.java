public class DiscountFareStrategy implements FareStrategy {
    private static final double COST_PER_KM = 0.75;
    private static final double COST_PER_MIN = 0.20;

    @Override
    public double calculateFare(double distanceKm, double durationMinutes) {
        return (distanceKm * COST_PER_KM) + (durationMinutes * COST_PER_MIN);
    }
}