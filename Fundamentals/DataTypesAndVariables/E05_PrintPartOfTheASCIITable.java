package _02_dataTypesAndVariables_E05_PrintPartOfTheASCIITable;

import java.util.Scanner;

public class E05_PrintPartOfTheASCIITable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstCharCode = Integer.parseInt(scanner.nextLine());
        int lastCharCode = Integer.parseInt(scanner.nextLine());

        for (int i = firstCharCode; i <= lastCharCode; i++) {

            System.out.printf("%c ", i);

        }
    }
}
