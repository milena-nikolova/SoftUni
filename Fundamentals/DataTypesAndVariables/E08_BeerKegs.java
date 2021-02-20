package _02_dataTypesAndVariables_E08_BeerKegs;

import java.util.Scanner;

public class E08_BeerKegs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nrOfInputs = Integer.parseInt(scanner.nextLine());
        String biggestKeg = "";
        double biggestKegVolume = 0;

        for (int i = 0; i < nrOfInputs; i++) {
            String kegModel = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double currentKegVolume = Math.PI * Math.pow(radius, 2)*height;
            if (currentKegVolume>biggestKegVolume){
                biggestKegVolume = currentKegVolume;
                biggestKeg = kegModel;
            }
        }
        System.out.println(biggestKeg);
    }
}
