package _03_arrays_L07_CondenseArrayToNumber;

import java.util.Arrays;
import java.util.Scanner;

public class L07_CondenseArrayToNumber_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        while (nums.length > 1) {
            int[] currentNums = new int[nums.length - 1];

            for (int i = 0; i < nums.length - 1; i++) {
                int condensedNum = nums[i] + nums[i + 1];

                currentNums[i] = condensedNum;
            }
            nums = currentNums;
        }
        for (int num : nums) {
            System.out.print(num);
        }
    }
}
