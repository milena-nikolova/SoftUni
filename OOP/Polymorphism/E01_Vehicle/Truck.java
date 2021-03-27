package E01_Vehicle;


public class Truck extends Vehicle{

    private static final double AIR_CONDITIONER_CONSUMPTION = 1.6;
    public Truck(double fuelQuantity, double fuelConsumptionPerKm) {
        super(fuelQuantity, fuelConsumptionPerKm + AIR_CONDITIONER_CONSUMPTION);
    }

    @Override
    public String drive(double distance) {
        return "Truck" + super.drive(distance);
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters * 0.95);
    }

    @Override
    public String toString() {
        return "Truck" + super.toString();
    }
}
