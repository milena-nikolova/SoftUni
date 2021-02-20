import java.util.Scanner;

public class E02_03_Elevator {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        int nrOfPersons = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        if (nrOfPersons<=capacity){
            System.out.println(1);
        }else {
            int nrOfCourses = nrOfPersons/capacity;
            if (nrOfPersons%capacity==0){
                System.out.println(nrOfCourses);
            }else {
                System.out.println(nrOfCourses+1);
            }
        }
    }
}
