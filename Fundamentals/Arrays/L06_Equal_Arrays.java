package _03_arrays_L06_EqualArrays;

import java.util.Scanner;

public class L06_Equal_Arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        String secondLine = scanner.nextLine();

        String[] firstArrAsString = firstLine.split(" ");
        String[] secondArrAsString = secondLine.split(" ");

        int[] firstArr = new int[firstArrAsString.length];
        int[] secondArr = new int[secondArrAsString.length];

        for (int i = 0; i < firstArr.length; i++) {
            firstArr[i] = Integer.parseInt(firstArrAsString[i]);
        }
        for (int i = 0; i < secondArr.length; i++) {
            secondArr[i] = Integer.parseInt(secondArrAsString[i]);
        }
        int sum = 0;
        boolean areIdentical = true;

        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] == secondArr[i]) {
                sum += firstArr[i];
            } else {
                System.out.println("Arrays are not identical. Found difference at " + i + " index.");
                areIdentical = false;
                break;
            }
        }
        if (areIdentical) {
            System.out.println("Arrays are identical. Sum: " + sum);
        }

    }
}
