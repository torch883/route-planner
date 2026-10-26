package navigation;

public class Navigator {

    public String buildRoute(String mode, String from, String to, double distanceKm) {
        if (mode.equals("car")) {
            int minutes = (int) (distanceKm / 50 * 60);
            return "Car route: " + from + " -> " + to + ", " + distanceKm + " km, ~" + minutes + " min";
        } else if (mode.equals("walk")) {
            int minutes = (int) (distanceKm / 5 * 60);
            return "Walk route: " + from + " -> " + to + ", " + distanceKm + " km, ~" + minutes + " min";
        } else if (mode.equals("cycle")) {
            int minutes = (int) (distanceKm / 15 * 60);
            return "Cycle route: " + from + " -> " + to + ", " + distanceKm + " km, ~" + minutes + " min";
        } else {
            return "Unknown mode";
        }
    }
}