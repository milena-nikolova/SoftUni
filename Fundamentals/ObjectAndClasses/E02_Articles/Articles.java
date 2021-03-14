package _06_objectAndClasses_E02_Articles;

public class Articles {
    String title;
    String content;
    String author;

    public Articles(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;

    }
    public void renameTitle(String title) {
        this.title = title;
    }

    public void editContent(String content) {
        this.content = content;
    }
    public void changeAuthor (String author){
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString(){
        return String.format("%s - %s: %s", getTitle(), getContent(), getAuthor());
    }
}
