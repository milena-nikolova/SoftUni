package _05_polymorphism.E01_Vehicle_1;
//todo - finish

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Car {fuel quantity} {liters per km}

        Map<String, Vehicle> vehiclesByType = new HashMap<>();

        for (int i = 0; i < 2; i++) {
            String[] vehicleData = scanner.nextLine().split("\\s+");

            String type = vehicleData[0];
            double fuelQuantity = Double.parseDouble(vehicleData[1]);
            double litersPerKm = Double.parseDouble(vehicleData[2]);
            putIntoMap(vehiclesByType, type, fuelQuantity, litersPerKm);
        }

        int n = Integer.parseInt(scanner.nextLine());

        //Drive Truck {distance}
        //Refuel Car {liters}

        for (int i = 0; i < n; i++) {
            String[] inputLine = scanner.nextLine().split("\\s+");
            String vehicleType = inputLine[1];
            double distanceOrLiters = Double.parseDouble(inputLine[2]);

            if (inputLine[0].equals("Drive")) {
                System.out.println(vehiclesByType.get(vehicleType).drive(distanceOrLiters));
            } else {
                vehiclesByType.get(vehicleType).refuel(distanceOrLiters);
            }

        }
        for (Vehicle vehicle : vehiclesByType.values()) {
            System.out.println(vehicle.toString());
        }
    }

    private static void putIntoMap(Map<String, Vehicle> vehicles, String type, double fuelQuantity, double litersPerKm) {
        if (type.equals("Car")) {
            vehicles.put(type, new Car(fuelQuantity, litersPerKm));
        } else {
            vehicles.put(type, new Truck(fuelQuantity, litersPerKm));
        }
    }
}
