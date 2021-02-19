import java.util.Scanner;

public class O01_BasicSyntax_E03_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        String typeOfPeople = scanner.nextLine();
        String day = scanner.nextLine();

        double price = 0;
        switch (day){
            case "Friday":
                if (typeOfPeople.equals("Students") ) {
                    if (numberOfPeople>=30){
                        price = numberOfPeople * 8.45*0.85;
                    }else {
                        price = numberOfPeople * 8.45;
                    }
                }
                if (typeOfPeople.equals("Business")){
                    if (numberOfPeople>=100){
                        price = (numberOfPeople-10)*10.90;
                    }else {
                price = numberOfPeople*10.90;
                    }
                }
                if (typeOfPeople.equals("Regular")){
                    if (numberOfPeople >=10 && numberOfPeople<=20){
                        price = numberOfPeople*15*0.95;
                    }else {
                        price=numberOfPeople*15;
                    }
                }
                break;
            case "Saturday":
                if (typeOfPeople.equals("Students") ) {
                    if (numberOfPeople>=30){
                        price = numberOfPeople * 9.8*0.85;
                    }else {
                        price = numberOfPeople * 9.8;
                    }
                }
                if (typeOfPeople.equals("Business")){
                    if (numberOfPeople>=100){
                        price = (numberOfPeople-10)*15.6;
                    }else {
                        price = numberOfPeople*15.6;
                    }
                }
                if (typeOfPeople.equals("Regular")){
                    if (numberOfPeople >=10 && numberOfPeople<=20){
                        price = numberOfPeople*20*0.95;
                    }else {
                        price=numberOfPeople*20;
                    }
                }
                break;
            case "Sunday":
                if (typeOfPeople.equals("Students") ) {
                    if (numberOfPeople>=30){
                        price = numberOfPeople * 10.46*0.85;
                    }else {
                        price = numberOfPeople * 10.46;
                    }
                }
                if (typeOfPeople.equals("Business")){
                    if (numberOfPeople>=100){
                        price = (numberOfPeople-10)*16;
                    }else {
                        price = numberOfPeople*16;
                    }
                }
                if (typeOfPeople.equals("Regular")){
                    if (numberOfPeople >=10 && numberOfPeople<=20){
                        price = numberOfPeople*22.5*0.95;
                    }else {
                        price=numberOfPeople*22.5;
                    }
                }
                break;
        }
        System.out.printf("Total price: %.2f%n", price);
    }
}
