package _01_workingWithAbstraction_E04_TrafficLights;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] inputColors = scanner.nextLine().split("\\s+");
        int countUpdates = Integer.parseInt(scanner.nextLine());

        List<TrafficLight> trafficLightList = new ArrayList<>();

        for (String color : inputColors) {
            TrafficLight trafficLight = new TrafficLight(LightsColor.valueOf(color));
            trafficLightList.add(trafficLight);
        }
        for (int i = 0; i < countUpdates; i++) {
            for (TrafficLight light : trafficLightList) {
                light.LightUpdate();
                System.out.print(light.getColor() + " ");
            }
            System.out.println();
        }
    }
}
