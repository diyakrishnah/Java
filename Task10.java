/*AUTHOR:DIYAKRISHNA
 * DATE:08/08/2025
 */
class Book{
	String title;
	String author;
	double price;
	Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void displayDetails() {
		System.out.println("Title:"+title);
		System.out.println("Author:"+author);
		System.out.println("Price:"+price);
	}
}
class Ebook extends Book{
	double fileSize;
	Ebook(String title,String author,double price,double fileSize){
		super(title,author,price);
		this.fileSize=fileSize;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("File Size :"+fileSize);
	}
}
class PrintedBook extends Book{
	int numberofPages;
	PrintedBook(String title,String author,double price,int numberofPages){
		super(title,author,price);
		this.numberofPages=numberofPages;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Number of Pages "+numberofPages);
	
	}
}
public class Task10 {
	public static void main(String[] args) {
		Ebook ebook= new Ebook("Book1","Unknown1",500.00,100.00);
		PrintedBook printedbook= new PrintedBook("Book2","Unknown2",1500.00,100);
		ebook.displayDetails();
		printedbook.displayDetails();	
	}
}
	

