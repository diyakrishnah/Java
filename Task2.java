/*AUTHOR: DIYA KRISHNA
 * DATE:11/7/2025
 */
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		System.out.print("Enter a number:");
		int number=scnr.nextInt();
		int original=number;
		int reverse=0,reminder;
		while(number>0) {
			reminder=number%10;
			reverse=reverse*10+reminder;
			number=number/10;
		}
		if (original==reverse) {
			System.out.println("The given number " + original + " is a pallindrome.");
		}
		else {
			System.out.println("The given number " + original +" is not a pallindrome.");
		}
		scnr.close();
	}

}
