package library;

public class Library {
	
	private Book[]bookArr;
	public Library(int size) {
		
		bookArr= new Book[size];
	}
	/*create a new book and save it in a given index*/
	public void setBook(int bookNum, String title, Author auth) {
		bookArr[bookNum]= new Book(title,auth);
	}
	/*return book in a given index*/
	public Book getBook(int bookNum) {
		return bookArr[bookNum];
	}
}
