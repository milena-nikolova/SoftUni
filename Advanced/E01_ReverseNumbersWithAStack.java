package _01_StacksAndQueues_E01_ReverseNumbersWithAStack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class E01_ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine()
                .split(" ")).map(Integer::parseInt)
                .forEach(numbers::push);

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
