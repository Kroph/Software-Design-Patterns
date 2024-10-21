public class SurgeFareStrategy implements FareStrategy {
    private static final double SURGE_MULTIPLIER = 2.0;
    private static final double BASE_COST_PER_KM = 1.00;
    private static final double BASE_COST_PER_MIN = 0.25;

    @Override
    public double calculateFare(double distanceKm, double durationMinutes) {
        return SURGE_MULTIPLIER * ((distanceKm * BASE_COST_PER_KM) + (durationMinutes * BASE_COST_PER_MIN));
    }
}