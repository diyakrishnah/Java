/* AUTHOR:diya krishna
 * DATE:19/08/2025
 * PROGRAM:Accepting an array from user and find the largest element in it.
 */
import java.util.Scanner;
public class Array2 {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter the size of the array :");
		int n =sn.nextInt();
		int [] array = new int[n];
		System.out.println("Enter the elements :");
		for(int i=0;i<n;i++) {
			array[i]=sn.nextInt();
		}
		System.out.println("The given array is :");
		for(int num:array) {
			System.out.print(num+"\t");
		}
		System.out.println();
		int largest=array[0];
		for(int i=0;i<n;i++) {
			if(array[i]>largest) {
				largest=array[i];
			}
		}
		System.out.println("The largest element in the array is "+largest+".");
}
}
