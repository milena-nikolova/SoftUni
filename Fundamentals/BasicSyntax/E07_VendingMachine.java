import java.util.Scanner;

public class E01_07_VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double sum = 0;

        while (!input.equals("Start")) {
            double inputMoney = Double.parseDouble(input);
            if (inputMoney == 0.1 || inputMoney == 0.2 || inputMoney == 0.5 || inputMoney == 1 || inputMoney == 2) {
                sum += inputMoney;
            } else {
                System.out.printf("Cannot accept %.2f%n", inputMoney);
            }
            input = scanner.nextLine();
        }

        String inputProduct = scanner.nextLine();
        double moneyLeft = sum;
        while (!inputProduct.equals("End")) {

            switch (inputProduct) {
                case "Nuts":
                    if (moneyLeft >= 2) {
                        moneyLeft -= 2;
                        System.out.println("Purchased Nuts");
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (moneyLeft >= 0.7) {
                        moneyLeft -= 0.7;
                        System.out.printf("Purchased %s%n", inputProduct);
                    } else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    moneyLeft -= 1.5;
                    if (moneyLeft >= 0) {
                        System.out.printf("Purchased %s%n", inputProduct);
                    } else {
                        System.out.println("Sorry, not enough money");
                        moneyLeft += 1.5;
                    }
                    break;
                case "Soda":
                    moneyLeft -= 0.8;
                    if (moneyLeft >= 0) {
                        System.out.printf("Purchased %s%n", inputProduct);
                    } else {
                        System.out.println("Sorry, not enough money");
                        moneyLeft += 0.8;
                    }
                    break;
                case "Coke":
                    moneyLeft -= 1;
                    if (moneyLeft >= 0) {
                        System.out.printf("Purchased %s%n", inputProduct);
                    } else {
                        System.out.println("Sorry, not enough money");
                        moneyLeft += 1;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
            }
            if (moneyLeft > 0) {
                inputProduct = scanner.nextLine();
            } else {
                break;
            }
        }
        if (moneyLeft >= 0) {
            {
                System.out.printf("Change: %.2f%n", moneyLeft);
            }
        }
    }
}
