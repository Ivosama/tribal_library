package tribal_library;
import java.util.Date;




public class Borrow {

	public Book book;
	public Date startDate;
	public Date endDate;
	public Notification notification;
	
	Borrow(){
		
	}
	
	Borrow(Book book){
		startDate = new Date();
	}
	
	public Book searchBook() {
		return book;
				
	}
	public void borrowWindow() {
		
	}
	public Book borrowBook() {
		return book;
	}
	public void addBook() {
		
	}
	public void removeBook() {
		
	}
	public void viewManageWindow() {
		
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Notification getNotification() {
		return notification;
	}
	public void setNotification(Notification notification) {
		this.notification = notification;
	}
}
