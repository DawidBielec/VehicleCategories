package dc;

abstract class Vehicle {
    private String mark;
    private String model;
    private int productionYear;

    private double fuelConsumptionOn100Km;

    public void setFuelInTank(double fuelInTank) {
        this.fuelInTank = fuelInTank;
    }

    private double fuelInTank;
    public String getMark() {
        return mark;
    }
    public String getModel() {
        return model;
    }
    public int getProductionYear() {
        return productionYear;
    }
    public double getFuelConsumptionOn100Km() {
        return fuelConsumptionOn100Km;
    }
    public double getFuelInTank() {
        return fuelInTank;
    }

    public int getRouteLength() {
        return routeLength;
    }

    public void setRouteLength(int routeLength) {
        this.routeLength = routeLength;
    }
    private int routeLength;
    public Vehicle(String mark, String model, int productionYear, double fuelConsumptionOn100Km) {
        this.mark = mark;
        this.model = model;
        this.productionYear = productionYear;
        this.fuelConsumptionOn100Km = fuelConsumptionOn100Km;
        fuelInTank = 0;
    }
    @Override
    public String toString() {
        return mark + " " + model + " " + productionYear;
    }
    public void fillUpOnFuel(double quantity) {
        fuelInTank += quantity;

    }
}
