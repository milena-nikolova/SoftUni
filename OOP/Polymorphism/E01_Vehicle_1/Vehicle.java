package _05_polymorphism.E01_Vehicle_1;

import java.text.DecimalFormat;

public abstract class Vehicle {

    double fuelQuantity;
    double fuelConsumptionPerKm;
    private DecimalFormat formatter;

    public Vehicle(double fuelQuantity, double fuelConsumptionPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumptionPerKm = fuelConsumptionPerKm;
        this.formatter = new DecimalFormat("##.##");
    }


    public String drive(double distance){
        if (distance * this.fuelConsumptionPerKm > fuelQuantity) {
            return " needs refueling";
        }
        this.fuelQuantity -= distance * this.fuelConsumptionPerKm;
        return " travelled " + formatter.format(distance) + " km";
    }

    public void refuel(double liters) {
        this.fuelQuantity += liters;
    }

    @Override
    public String toString() {
        return String.format(": %.2f", this.fuelQuantity);
    }
}
