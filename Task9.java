/*AUTHOR:DIYAKRISHNA
 * DATE:1/08/2025
 */
class Book{
	String Title;
	String Author;
	final int BookID;
	static int BookCounter=1000;
	static final String Library_name="Central Library";
	Book(){		
		this.BookID = 5200;
		Title="Unknown";
		Author="Unknown";
	}
	Book(String Title,String Author){
		this.Title=Title;
		this.Author=Author;
		this.BookID = 25000;
	}
	public void displayInfo() {
		System.out.println(Title);
		System.out.println(Author);
		System.out.println(BookID);
	}
	boolean showlibrary;
}
public class Task9 {
	
}
