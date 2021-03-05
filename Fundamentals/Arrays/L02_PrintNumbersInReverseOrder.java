package _03_Arrays_L02_PrintNumbersInReverseOrder;

import java.util.Scanner;

public class L02_PrintNumbersInReverseOrder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int inputCount = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[inputCount];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = numbers.length-1; i >=0 ; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}

