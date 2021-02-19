import java.util.Scanner;

public class O01_BasicSyntax_E05_Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);

        }
        String inputPass = scanner.nextLine();
        int nrOfInputs = 0;
        while (!inputPass.equals(password)) {
            nrOfInputs++;
            if (nrOfInputs < 4) {
                System.out.println("Incorrect password. Try again.");
                inputPass = scanner.nextLine();
            } else {
                System.out.printf("User %s blocked!", username);
                break;
            }
        }
        if (inputPass.equals(password)){
            System.out.printf("User %s logged in.%n", username);
        }
    }
}


