package navigation;

public class WalkStrategy implements RouteStrategy {

    private static final double AVERAGE_SPEED_KM_H = 5;

    @Override
    public String getName() {
        return "Walk";
    }

    @Override
    public String buildRoute(String from, String to, double distanceKm) {
        int minutes = (int) (distanceKm / AVERAGE_SPEED_KM_H * 60);
        return "Walking route via sidewalks and parks: " + from + " -> " + to
                + ", " + distanceKm + " km, ~" + minutes + " min";
    }
}