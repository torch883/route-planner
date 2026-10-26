package navigation;

public class CycleStrategy implements RouteStrategy {

    private static final double AVERAGE_SPEED_KM_H = 15;

    @Override
    public String getName() {
        return "Cycle";
    }

    @Override
    public String buildRoute(String from, String to, double distanceKm) {
        int minutes = (int) (distanceKm / AVERAGE_SPEED_KM_H * 60);
        return "Cycling route via bike lanes: " + from + " -> " + to
                + ", " + distanceKm + " km, ~" + minutes + " min";
    }
}