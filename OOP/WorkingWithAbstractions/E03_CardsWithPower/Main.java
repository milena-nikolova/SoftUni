package _01_workingWithAbstraction_E03_CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputRank = scanner.nextLine();
        String inputSuit = scanner.nextLine();

        Card card = new Card(RankPowers.valueOf(inputRank),
                SuitPowers.valueOf(inputSuit));

        System.out.println(card);
    }
}
