package _05_polymorphism.E01_Vehicle_1;

public class Car extends Vehicle {

    private static final double AIR_CONDITIONER_CONSUMPTION = 0.9;
    public Car(double fuelQuantity, double fuelConsumptionPerKm) {
        super(fuelQuantity, fuelConsumptionPerKm + AIR_CONDITIONER_CONSUMPTION);
    }

    @Override
    public String drive(double distance) {
        return "Car" + super.drive(distance);
    }

    @Override
    public void refuel(double liters) {
        super.refuel(liters);
    }

    @Override
    public String toString() {
        return "Car" + super.toString();
    }


}
