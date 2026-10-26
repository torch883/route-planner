package navigation;

public interface RouteStrategy {

    String getName();

    String buildRoute(String from, String to, double distanceKm);
}