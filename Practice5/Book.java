package Practice5;

class Book {
    String title;
    String author;

    Book(String title) {
        this.title = title;
    }

    Book(String title, String author) {
        this(title);
        this.author = author;
    }

    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + (author != null ? author : "Not specified"));
    }

    public static void main(String[] args) {
        Book book1 = new Book("Java Programming");
        Book book2 = new Book("Clean Code", "Robert C. Martin");

        book1.displayBook();
        System.out.println();
        book2.displayBook();
    }
}
