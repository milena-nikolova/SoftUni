package _06_objectAndClasses_E01_AdvertisementMessage;

import java.util.Random;

public class Message {
    String[] phrases = new String[]{"Excellent product.", "Such a great product.",
            "I always use that product.", "Best product of its category.",
            "Exceptional product.", "I can’t live without this product."};
    String[] events = new String[]{"Now I feel good.", "I have succeeded with this product.",
            "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.",
            "Try it yourself, I am very satisfied.", "I feel great!"};
    String[] authors = new String[]{"Diana", "Petya", "Stella", "Elena",
            "Katya", "Iva", "Annie", "Eva"};
    String[] cities = new String[]{"Burgas", "Sofia", "Plovdiv",
            "Varna", "Ruse"};

    Random random = new Random();

    public String randomMsg() {
        return String.format("%s %s %s - %s",
                phrases[random.nextInt(phrases.length)],
                events[random.nextInt(events.length)],
                authors[random.nextInt(authors.length)],
                cities[random.nextInt(cities.length)]);
    }
}
