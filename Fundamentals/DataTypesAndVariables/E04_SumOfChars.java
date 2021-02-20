import java.util.Scanner;

public class E02_04_SumOfChars {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int nrOfLines = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 0; i <nrOfLines ; i++) {
            String charAsString = scanner.nextLine();
            char letter = charAsString.charAt(0);
            sum+=letter;

        }
        System.out.println("The sum equals: " + sum);
    }
}
