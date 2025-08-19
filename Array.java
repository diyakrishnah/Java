/* AUTHOR:diya krishna
 * DATE:19/08/2025
 * PROGRAM:array
 */
import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		int [] array1 = {1,2,3,4};
		int [] array2 = new int[4];
		System.out.println(array1[0]);
		System.out.println(array1.length);
		System.out.println();
		for(int i=0;i<4;i++) {
			System.out.print(array1[i]+"\t");
		}
		System.out.println("Using enhanced for loop");
		for (int num:array1) {{
			System.out.print(num+"\t");
		}
		System.out.println();
		}
	}
}
