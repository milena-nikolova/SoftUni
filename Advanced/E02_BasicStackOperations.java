package _01_StacksAndQueues_E02_BasicStackOperations;
//createdByBibiloto@15.01.2021

import java.util.ArrayDeque;
import java.util.Scanner;

public class E02_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elementsToPush = scanner.nextInt();
        int elementsToPop = scanner.nextInt();
        int elementToSearch = scanner.nextInt();
        scanner.nextLine();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < elementsToPush; i++) {
            stack.push(scanner.nextInt());
        }
        for (int i = 0; i < elementsToPop; i++) {
            stack.pop();
        }
        if (stack.isEmpty()) {
            System.out.println(0);
        } else if (stack.contains(elementToSearch)) {
            System.out.println("true");
        } else {
            System.out.println((smallestElement(stack)));
        }
    }

    private static int smallestElement(ArrayDeque<Integer> stack) {
        int smallestElement = Integer.MAX_VALUE;
        for (Integer integer : stack) {
            if (integer < smallestElement) {
                smallestElement = integer;
            }
        }
        return smallestElement;
    }
}

/*

5 2 13
1 13 45 32 4

4 1 666
420 69 13 666

 */