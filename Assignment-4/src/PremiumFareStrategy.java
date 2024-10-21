public class PremiumFareStrategy implements FareStrategy {
    private static final double COST_PER_KM = 2.00;
    private static final double COST_PER_MIN = 0.50;

    @Override
    public double calculateFare(double distanceKm, double durationMinutes) {
        return (distanceKm * COST_PER_KM) + (durationMinutes * COST_PER_MIN);
    }
}