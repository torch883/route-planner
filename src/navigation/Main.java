package navigation;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Map<String, RouteStrategy> strategies = new LinkedHashMap<>();
        strategies.put("1", new CarStrategy());
        strategies.put("2", new WalkStrategy());
        strategies.put("3", new CycleStrategy());
        strategies.put("4", new PublicTransportStrategy());

        Navigator navigator = new Navigator(strategies.get("1"));
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose transport:");
            for (Map.Entry<String, RouteStrategy> entry : strategies.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue().getName());
            }
            System.out.println("0 - Exit");

            String choice = scanner.nextLine();
            if (choice.equals("0")) {
                break;
            }

            RouteStrategy chosen = strategies.get(choice);
            if (chosen == null) {
                System.out.println("Unknown option, try again.");
                continue;
            }

            navigator.setStrategy(chosen);
            System.out.println(navigator.planRoute("Astana IT University", "Khan Shatyr", 8.5));
        }
    }
}