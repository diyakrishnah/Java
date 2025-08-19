/* AUTHOR:diya krishna
 * DATE:19/08/2025
 * PROGRAM:Matrix
 */

import java.util.Scanner;
public class MatrixTranspose {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.print("Enter the number of rows :");
		int row =sn.nextInt();
		System.out.print("Enter the number of columns :");
		int col =sn.nextInt();
		int[row][col] matrix1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix1[i][j]=sn.nextInt();
			}
			System.out.println();
	}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(matrix1[i][j]+"\t");
			}
			System.out.println();
		}
		int[][]transpose;
}
}
