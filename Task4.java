/*AUTHOR:DIYA KRISHNA
 * DATE:18/7/2025
 */
class Book{
		String title;
		String Author;
		double price;
		Book(){
			title="Unknown";
			Author="Not Assigned";
			price=0.0;
		}
		public void displaydetails() {
			System.out.println("Title:\t"+title);
			System.out.println("Author:\t"+Author);
			System.out.println("Price:\t"+price);
		}
		}
public class Task4 {
	public static void main(String[] args) {
		Book book1 =new Book();
		book1.displaydetails();
	}
}
