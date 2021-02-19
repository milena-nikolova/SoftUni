import java.util.Scanner;
// 50/100 в джъдж

public class E01_10_RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        double sumExpenses = 0;

        for (int i = 2; i <=lostGamesCount; i+=2) { //Every second lost game, Pesho trashes his headset
            sumExpenses +=headsetPrice;
                    }
        for (int i = 3; i <=lostGamesCount ; i+=3) {//Every third lost game, Pesho trashes his mouse
            sumExpenses+=mousePrice;
        }int keyboardTrash = 0;

        if (lostGamesCount/2 >0 && lostGamesCount/3>0){
            for (int i = 6; i < lostGamesCount; i+=6) {//When Pesho trashes both his mouse and headset in the same lost game, he also trashes his keyboard
                sumExpenses +=keyboardPrice;
                keyboardTrash++;
                if (keyboardTrash==2){
                    sumExpenses+=displayPrice;
                    keyboardTrash = 0;
                }
            }
        }
        System.out.printf("Rage expenses: %.2f lv.%n", sumExpenses);

    }
}
