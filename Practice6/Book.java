package Practice6;

class Books {
    private int BookId;
    private String BookName;
    private String BookAuthor;
    private String YearOfPub;
    private float Price;
    private String Status;

    public Books(int bookId, String bookName, String bookAuthor, String yearOfPub, float price, String status) {
        this.BookId = bookId;
        this.BookName = bookName;
        this.BookAuthor = bookAuthor;
        this.YearOfPub = yearOfPub;
        this.Price = price;
        this.Status = status;
    }

    public int getBookId() {
        return BookId;
    }

    public String getBookName() {
        return BookName;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        this.Status = status;
    }

    public void AddNewBooks() {
        System.out.println("Book '" + BookName + "' added successfully with ID: " + BookId);
    }

    public void DeleteBooks() {
        System.out.println("Book '" + BookName + "' with ID: " + BookId + " deleted successfully");
    }

    public void DisplayBookDetails() {
        System.out.println("Book ID: " + BookId);
        System.out.println("Name: " + BookName);
        System.out.println("Author: " + BookAuthor);
        System.out.println("Year of Publication: " + YearOfPub);
        System.out.println("Price: $" + Price);
        System.out.println("Status: " + Status);
    }

    public void InquiryBook() {
        System.out.println("Inquiry for '" + BookName + "': " + (Status.equals("Available") ? "Available" : "Not Available"));
    }
}