public class RegularFareStrategy implements FareStrategy {
    private static final double COST_PER_KM = 1.00;
    private static final double COST_PER_MIN = 0.25;

    @Override
    public double calculateFare(double distanceKm, double durationMinutes) {
        return (distanceKm * COST_PER_KM) + (durationMinutes * COST_PER_MIN);
    }
}