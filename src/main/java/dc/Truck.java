package dc;

public class Truck extends Vehicle {
    private int capacity;
    private int cargo;
    public Truck(String mark, String model, int productionYear, double fuelConsumptionOn100Km, int capacity) {
        super(mark, model, productionYear, fuelConsumptionOn100Km);
        this.capacity = capacity;
        cargo = 0;
    }
    private void loadCar(int quantity) throws CargoException {
        try {
            if (quantity + cargo > capacity) {
                throw new CargoException(capacity - cargo - quantity);
            }
            cargo += quantity;
        }
        catch(CargoException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void unloadCar() {
        cargo = 0;
        setRouteLength(0);
    }
    public void hitRoute(int quantityKm, int cargo) {
        setRouteLength(quantityKm);
        try {
            loadCar(cargo);
        }
        catch(CargoException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void finishRoute() {
        double quantityFuelConsumption = (getFuelConsumptionOn100Km()*getRouteLength()/100) *(1 + cargo / capacity);
        try {
            if (quantityFuelConsumption > getFuelInTank()) {
                int quantityRode = (int)(getFuelInTank()/ getFuelConsumptionOn100Km()*100 / ((1 + cargo / capacity)));
                setFuelInTank(0);
                setRouteLength(getRouteLength()-quantityRode);
                throw new RouteException("zabrakło paliwa po przejechaniu " + quantityRode + " km");
            }
            else
            {
                // udało się dojechać do celu
                System.out.println("Dotarłem do celu : " + getRouteLength() + " km");
                setFuelInTank(getFuelInTank()-quantityFuelConsumption);
                setRouteLength(0);
            }
        }
        catch (RouteException te) {
            System.out.println(te.getMessage());
        }
    }
}
