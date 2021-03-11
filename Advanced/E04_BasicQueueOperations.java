package _01_StacksAndQueues_E04_BasicQueueOperations;
//createdByBibiloto@15.01.2021

import java.util.ArrayDeque;
import java.util.Scanner;

public class E04_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int numberOfElementsToAdd = scanner.nextInt();
        int numberOfElementsToPoll = scanner.nextInt();
        int elementToCheck = scanner.nextInt();

        for (int i = 0; i < numberOfElementsToAdd; i++) {
            queue.offer(scanner.nextInt());
        }
        for (int i = 0; i < numberOfElementsToPoll; i++) {
            queue.poll();
        }
        if (queue.isEmpty()) {
            System.out.println(0);
        } else if (queue.contains(elementToCheck)) {
            System.out.println("true");
        } else {
            System.out.println(printTheSmallestElement(queue));
        }
    }

    private static int printTheSmallestElement(ArrayDeque<Integer> queue) {
        int minNumber = Integer.MAX_VALUE;
        for (Integer integer : queue) {
            if (integer < minNumber) {
                minNumber = integer;
            }
        }
        return minNumber;
    }
}
