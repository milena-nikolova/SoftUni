import java.util.Scanner;

public class E01_06_StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Write a program to check if a given number is a strong number or not.
//        A number is strong if the sum of the Factorial of each digit is equal to the number.
//        For example 145 is a strong number, because 1! + 4! + 5! = 145.
//        Print "yes" if the number is strong and "no" if the number is not strong.

        String input = scanner.nextLine(); // четем число от конзолата като стринг
        int sum = 0;

        for (int i = 0; i < input.length(); i++) { // на всяко завъртане
            int digit = input.charAt(i) - 48;

            int fact = 1;
            for (int j = 1; j <= digit; j++) {
                fact *= j;
            }
            sum += fact;
        }
            int inputNumber = Integer.parseInt(input);
        if (inputNumber == sum){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
