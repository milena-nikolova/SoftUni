import java.util.Scanner;

public class E01_09_PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amountOfMoney = Double.parseDouble(scanner.nextLine());
        int nrOfStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightsaber = Double.parseDouble(scanner.nextLine());
        double priceOfRobe = Double.parseDouble(scanner.nextLine());
        double priceOfBelt = Double.parseDouble(scanner.nextLine());

        double totalSum = 0;

        double totalPriceOfLightsabers = Math.ceil(nrOfStudents * 1.1) * priceOfLightsaber;
        double totalPriceRobes = nrOfStudents * priceOfRobe;
        int nrOfBelts = nrOfStudents - nrOfStudents / 6;
        double totalPriceOfBelts = nrOfBelts * priceOfBelt;

        totalSum = totalPriceOfLightsabers + totalPriceRobes + totalPriceOfBelts;

        if (amountOfMoney >= totalSum) {
            System.out.printf("The money is enough - it would cost %.2flv.%n", totalSum);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", totalSum - amountOfMoney);
        }
    }
}
