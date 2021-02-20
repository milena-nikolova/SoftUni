package _02_dataTypesAndVariables_E07_WaterOverflow;

import java.util.Scanner;

public class E07_WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentLtsLeft = 255;
        int nrOfInputs = Integer.parseInt(scanner.nextLine());
        int currentLitters = 0;

        for (int i = 0; i < nrOfInputs; i++) {
            int inputLitters = Integer.parseInt(scanner.nextLine());
            if (inputLitters<=currentLtsLeft) {
                currentLtsLeft -= inputLitters;
                currentLitters+=inputLitters;
            }else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(currentLitters);
    }
}
