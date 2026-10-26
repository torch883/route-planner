package navigation;

public class PublicTransportStrategy implements RouteStrategy {

    private static final double AVERAGE_SPEED_KM_H = 25;
    private static final int WAITING_TIME_MINUTES = 10;

    @Override
    public String getName() {
        return "Public transport";
    }

    @Override
    public String buildRoute(String from, String to, double distanceKm) {
        int minutes = (int) (distanceKm / AVERAGE_SPEED_KM_H * 60) + WAITING_TIME_MINUTES;
        return "Bus route: " + from + " -> " + to
                + ", " + distanceKm + " km, ~" + minutes + " min (including waiting)";
    }
}