import java.util.Scanner;

public class E01_08_TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <=inputNumber; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print(i +" ");
            }
            System.out.println();
        }
    }
}
