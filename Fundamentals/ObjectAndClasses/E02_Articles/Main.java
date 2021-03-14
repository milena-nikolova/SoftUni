package _06_objectAndClasses_E02_Articles;
//createdByBibiloto14112020
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] data = scanner.nextLine().split(", ");
        String title = data[0];
        String content = data[1];
        String author = data[2];


        Articles article = new Articles(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] command = scanner.nextLine().split(": ");
            switch (command[0]) {
                case "Edit":
                    article.editContent(command[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(command[1]);
                    break;
                case "Rename":
                    article.renameTitle(command[1]);
                    break;
            }
        }
        System.out.println(article.toString());
    }
}
