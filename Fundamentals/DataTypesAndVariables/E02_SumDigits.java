import java.util.Scanner;
//да я реша без -48 - как се отпечатва инт стойността на чар-а??

public class E02_02_Sum_Digits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String intAsString = scanner.nextLine();
        int sumOfDigits = 0;

        for (int i = 0; i < intAsString.length(); i++) {
            int digitAsChar = intAsString.charAt(i)-48;
            sumOfDigits += (int)digitAsChar;

        }
        System.out.println(sumOfDigits);
    }
}
