package E01_Vehicle;
//todo - finish
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Car {fuel quantity} {liters per km}

        String[] carData = scanner.nextLine().split("\\s+");
        Car car = new Car(Double.parseDouble(carData[1]),
                Double.parseDouble(carData[2]));

        String[] truckData = scanner.nextLine().split("\\s+");
        Truck truck = new Truck(Double.parseDouble(truckData[1]),
                Double.parseDouble(truckData[2]));

        int n = Integer.parseInt(scanner.nextLine());

        //Drive Truck {distance}
        //Refuel Car {liters}

        for (int i = 0; i < n; i++) {
            String[] inputLine = scanner.nextLine().split("\\s+");
            String vehicleType = inputLine[1];
            double distanceOrLiters = Double.parseDouble(inputLine[2]);


            if (inputLine[0].equals("Drive")){
                System.out.println(
                        driveGivenVehicle(vehicleType, distanceOrLiters, car, truck));
            }else {
                refuelGivenVehicle(vehicleType, distanceOrLiters, car, truck);
            }

        }
        System.out.println(car);
        System.out.println(truck);
    }

    private static void refuelGivenVehicle(String vehicleType, double liters, Car car, Truck truck) {
        if (vehicleType.equals("Car")) {
            car.refuel(liters);
        }else {
            truck.refuel(liters);
        }
    }

    private static String driveGivenVehicle(
            String vehicleType, double distance, Car car, Truck truck) {
        if (vehicleType.equals("Car")){
            return car.drive(distance);
        }
           return truck.drive(distance);
    }
}
