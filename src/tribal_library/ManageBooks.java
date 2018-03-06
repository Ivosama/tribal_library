public class ManageBooks {
    
    static int maxBooks = 1000;
    int bookCounter = 0;
    
    Book[] books = new Book[maxBooks];

void addBook(String title, String author, int year) {
        books[bookCounter] = new book(title, author, year, bookCounter);
        bookCounter++;
    }
void removeBook(int ID) {
        
    }
}
