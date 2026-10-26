package navigation;

public class CarStrategy implements RouteStrategy {

    private static final double AVERAGE_SPEED_KM_H = 50;

    @Override
    public String getName() {
        return "Car";
    }

    @Override
    public String buildRoute(String from, String to, double distanceKm) {
        int minutes = (int) (distanceKm / AVERAGE_SPEED_KM_H * 60);
        return "Car route via roads: " + from + " -> " + to
                + ", " + distanceKm + " km, ~" + minutes + " min";
    }
}