package library;

public class Book {
	private String title;
	private Author auth;
	/*construct a new book*/
	public Book(String title,Author auth){
		
		this.title=title;
		this.auth=auth;
	}
	/*returns book title*/
	public String getTitle() {
		return title;
	}
	/*returns book authors name*/
	public String getAuthorName(){
		return auth.getName();
	}
	/*return book author birth year*/
	public int getAuthorBirthYear(){
		return auth.getBirthYear();
	}
	/*return a print string for book*/
	public String toString()
	{
		return title+" written by "+auth.toString();
	}

}
