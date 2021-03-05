package _03_arrays_L01_DayOfWeek;

import java.util.Scanner;

public class L01_DayOfWeek {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        String [] daysOfWeek = new String[] {"Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday"};

        if (input<1 || input>7){
            System.out.println("Invalid day!");
        }else {
            System.out.println(daysOfWeek[input - 1]);
        }
    }
}
