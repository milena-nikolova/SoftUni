import java.util.Scanner;

public class O01_BasicSyntax_E04_PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int endNumber = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while (startNumber <= endNumber){
            System.out.print(startNumber + " ");
            sum +=startNumber;
            startNumber++;
        }
        System.out.println();
        System.out.printf("Sum: %d%n", sum);
    }
}
