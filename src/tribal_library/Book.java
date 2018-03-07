package tribal_library;
public class Book {

	private int ID;
	private String title;
	private int year;
	private int stock;

	Book() {

	}        

	Book(int ID, String title, int year, int stock) {
		this.ID = ID;
		this.title = title;
		this.year = year;
		this.stock = stock;
	}

	public int getID() {
		return this.ID;
	}
	public void setID(int ID) {
		this.ID = ID;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public int getStock() {
		return this.stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public boolean isInStock() {
		if (this.stock > 0) {
			return true;
		} else {
			return false;
		}
	}

	public void displayBookDetails() {
		System.out.println("ID: " + this.ID + ", Title: " + this.title + ", Year: " + this.year + ", Current stock: " + this.stock);
	}

}
