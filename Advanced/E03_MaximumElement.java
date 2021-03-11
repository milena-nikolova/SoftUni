package _01_StacksAndQueues_E03_MaximumElement;
//createdByBibiloto@15.01.2021

import java.util.ArrayDeque;
import java.util.Scanner;

public class E03_MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        int numberOfElements = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfElements; i++) {
            String[] tokens = scanner.nextLine().split("\\s+");
            int command = Integer.parseInt(tokens[0]);

            switch (command) {
                case 1:
                    stack.push(Integer.parseInt(tokens[1]));
                    break;
                case 2:
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    break;
                case 3:
                    System.out.println(findMaxElementInStack(stack));
                    break;
            }
        }
    }

    private static int findMaxElementInStack(ArrayDeque<Integer> stack) {
        int maxElement = Integer.MIN_VALUE;
        for (Integer integer : stack) {
            if (integer > maxElement) {
                maxElement = integer;
            }
        }
        return maxElement;
    }
}
