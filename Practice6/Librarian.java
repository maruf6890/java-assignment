package Practice6;

import java.util.ArrayList;
import java.util.List;


class Librarian {
    private int Id;
    private String Name;
    private boolean VerifyMember;
    private List<Books> books;

    public Librarian(int id, String name, boolean verifyMember) {
        this.Id = id;
        this.Name = name;
        this.VerifyMember = verifyMember;
        this.books = new ArrayList<>();
    }

    public void addBook(Books book) {
        books.add(book);
        book.AddNewBooks();
    }

    public void SearchBook(String name) {
        for (Books book : books) {
            if (book.getBookName().equalsIgnoreCase(name)) {
                System.out.println("Book found:");
                book.DisplayBookDetails();
                return;
            }
        }
        System.out.println("Book '" + name + "' not found.");
    }

    public void OrderBooks() {
        System.out.println("Librarian " + Name + " placed an order for new books.");
    }

    public void SellBooks() {
        System.out.println("Librarian " + Name + " sold a book.");
    }

    public boolean verifyMember() {
        return VerifyMember;
    }
}