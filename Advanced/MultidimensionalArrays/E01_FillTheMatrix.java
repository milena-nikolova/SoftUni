package _02_MultidimensionalArrays_E01_FillTheMatrix;
//createdByBibiloto21012021
import java.util.Scanner;

public class E01_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",\\s+");
        int rowsAndCols = Integer.parseInt(input[0]);
        String type = input[1];

        int[][] matrix = new int[rowsAndCols][rowsAndCols];

        int counter = 0;
        if ("A".equals(type)) {
            for (int col = 0; col < rowsAndCols; col++) {
                for (int row = 0; row < rowsAndCols; row++) {
                    matrix[row][col] = ++counter;
                }
            }
        } else if ("B".equals(type)) {
            for (int col = 0; col < rowsAndCols; col++) {
                if (col % 2 == 0) {
                    for (int row = 0; row < rowsAndCols; row++) {
                        matrix[row][col] = ++counter;
                    }
                } else {
                    for (int row = rowsAndCols - 1; row >= 0; row--) {
                        matrix[row][col] = ++counter;
                    }
                }
            }
        }

        for (int row = 0; row < rowsAndCols; row++) {
            for (int col = 0; col < rowsAndCols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
