package dc;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Ford", "Focus", 2015, 6.2);
        car1.fillUpOnFuel(40);
        Truck truck1 = new Truck("Mercedes","Vito", 2017, 12.5, 2000);
        truck1.fillUpOnFuel(120);
        try {
            car1.hitRoute(300);
            car1.finishRoute();
            truck1.hitRoute(230, 400);
            truck1.finishRoute();
            truck1.hitRoute(630, 400);
            truck1.finishRoute();
            truck1.hitRoute(730, 400);
            truck1.finishRoute();
        }
        catch(RouteException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
