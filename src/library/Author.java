package library;

public class Author {
	private String name;
	private int birthYear;
	/*construct a new author*/
	public Author(String name, int birthYear) {
		this.name= name;
		this.birthYear=birthYear;
	}
	/*return author name*/
	public String getName() {
		return name;
	}
	/*return author birth year*/
	public int getBirthYear() {
		return birthYear;
	}
	/*return author age*/
	public int getAge(int thisYear) {
		return thisYear-birthYear;
	}
	/*print the author details*/
	public String toString() {
		return name+"("+birthYear+")";
	}

}
