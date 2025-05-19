package Practice6;

import java.util.ArrayList;
import java.util.List;


class User {
    private int UserID;
    private String UserName;
    private String UserAddress;
    private String PhoneNo;
    private List<Books> borrowedBooks;

    public User(int userID, String userName, String userAddress, String phoneNo) {
        this.UserID = userID;
        this.UserName = userName;
        this.UserAddress = userAddress;
        this.PhoneNo = phoneNo;
        this.borrowedBooks = new ArrayList<>();
    }

    public void ReturnBooks() {
        if (borrowedBooks.isEmpty()) {
            System.out.println(UserName + " has no books to return.");
            return;
        }
        for (Books book : borrowedBooks) {
            book.setStatus("Available");
            System.out.println(UserName + " returned '" + book.getBookName() + "'.");
        }
        borrowedBooks.clear();
    }

    public int PayFine(int date) {
        int finePerDay = 1;
        int daysLate = date - 30;
        if (daysLate <= 0) {
            System.out.println("No fine for " + UserName + ".");
            return 0;
        }
        int fine = daysLate * finePerDay;
        System.out.println(UserName + " paid a fine of $" + fine + " for " + daysLate + " days late.");
        return fine;
    }

    public void AddNewUser() {
        System.out.println("User '" + UserName + "' added with ID: " + UserID);
    }

    public void DeleteUser() {
        System.out.println("User '" + UserName + "' with ID: " + UserID + " deleted.");
    }

    public void UpdateDetails() {
        System.out.println("Details updated for User '" + UserName + "'.");
    }

    public void BookPurchase() {
        System.out.println(UserName + " purchased a book.");
    }

    public void borrowBook(Books book, Librarian librarian) {
        if (!librarian.verifyMember()) {
            System.out.println("User verification failed. Cannot borrow books.");
            return;
        }
        if (book.getStatus().equals("Available")) {
            borrowedBooks.add(book);
            book.setStatus("Borrowed");
            System.out.println(UserName + " borrowed '" + book.getBookName() + "'.");
        } else {
            System.out.println("Book '" + book.getBookName() + "' is not available for borrowing.");
        }
    }
}