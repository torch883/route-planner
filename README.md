# Route Planner: Strategy Pattern (Java 17)

Assignment #5, ShP-2216 Software Design Patterns.

## Build and run
    javac -d out src/navigation/*.java
    java -cp out navigation.Main

## How to add a new strategy
1. Create a class `XxxStrategy implements RouteStrategy` in `src/navigation`.
2. Implement `getName()` and `buildRoute(...)`.
3. Register it in `Main`: `strategies.put("5", new XxxStrategy());`
   `Navigator` and the other strategies stay unchanged.

## Structure
- `RouteStrategy`: strategy interface
- `CarStrategy`, `WalkStrategy`, `CycleStrategy`, `PublicTransportStrategy`: concrete strategies
- `Navigator`: context
- `Main`: client