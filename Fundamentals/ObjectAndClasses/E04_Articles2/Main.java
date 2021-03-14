package _06_objectAndClasses_E04_Articles2;
//createdByBibiloto11112020
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Article> articleList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(", ");
            Article currentArticle = new Article(data[0], data[1], data[2]);
            articleList.add(currentArticle);
        }
        String input = scanner.nextLine();

        switch (input) {
            case "title":
                articleList.stream()
                        .sorted(Comparator.comparing(Article::getTitle))
                        .forEach(t -> System.out.println(t.toString()));
                break;
            case "content":
                articleList.stream()
                        .sorted(Comparator.comparing(Article::getContent))
                        .forEach(c -> System.out.println(c.toString()));
                break;
            case "author":
                articleList.stream()
                        .sorted(Comparator.comparing(Article::getAuthor))
                        .forEach(a -> System.out.println(a.toString()));
                break;
        }
    }
}
