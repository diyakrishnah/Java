/*AUTHOR: DIYA KRISHNA
 * DATE:11/7/2025
 */
import java.util.Scanner;
public class Task3 {
	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		System.out.print("Enter a limit:");
		int limit =scnr.nextInt();
		int i;
		System.out.print("The even numbers upto " +limit +" is ");
		for (i=2;i<limit;i+=2) {
			System.out.print(i+" ");
		}
		scnr.close();
	}

}
