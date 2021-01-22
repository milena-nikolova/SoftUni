package _01_BasicSyntax_E02_Division;

import java.util.Scanner;

public class E02_Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());
        String output = "Not divisible";

        if (inputNumber % 10 == 0) {
            System.out.println("The number is divisible by " + 10);
        }else if (inputNumber % 7 == 0) {
            System.out.println("The number is divisible by " + 7);
        } else if (inputNumber % 6 == 0) {
            System.out.println("The number is divisible by " + 6);
        } else if (inputNumber % 3 == 0) {
            System.out.println("The number is divisible by " + 3);
        }else if (inputNumber % 2 == 0) {
            System.out.println("The number is divisible by " + 2);
        } else {
            System.out.println(output);
        }
    }
}
