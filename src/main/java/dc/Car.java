package dc;

public class Car extends Vehicle {
    public void hitRoute(int ileKM) {
        setRouteLength(ileKM);
    }
    public Car(String mark, String model, int productionYear, double fuelConsumptionOn100Km) {
        super(mark, model, productionYear, fuelConsumptionOn100Km);
    }
    public void finishRoute() throws RouteException {
        // obliczenie ile paliwa samochód wypalił
        try {
            double consumedQuatity = getFuelConsumptionOn100Km() * getRouteLength() / 100;
            if (consumedQuatity > getFuelInTank()) {
                setFuelInTank(0);
                throw new RouteException("zabrakło paliwa");
            }
            else {
                double quantityFuel = getFuelInTank();
                setFuelInTank(quantityFuel - consumedQuatity);
            }
            setRouteLength(0);
        }
        catch (RouteException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
