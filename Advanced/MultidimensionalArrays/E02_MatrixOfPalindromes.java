package _02_MultidimensionalArrays_E02_MatrixOfPalindromes;
//createdByBibiloto21012021
import java.util.Arrays;
import java.util.Scanner;

public class E02_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] rowsAndCols = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rows = rowsAndCols[0];
        int cols = rowsAndCols[1];

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char firstAndLastLetter = (char) (row + 97);
                char middleLetter = (char) (row + col + 97);
                String currentPalindrome = String.format("%c%c%c", firstAndLastLetter, middleLetter, firstAndLastLetter);

                matrix[row][col] = currentPalindrome;
            }
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
