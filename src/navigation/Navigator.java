package navigation;

public class Navigator {

    private RouteStrategy strategy;

    public Navigator(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public String planRoute(String from, String to, double distanceKm) {
        return strategy.buildRoute(from, to, distanceKm);
    }
}