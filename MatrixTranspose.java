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
		int[][] matrix=new int[row][col];
		System.out.println("Enter the elements of the matrix:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix[i][j]=sn.nextInt();
			}
	}
		System.out.println("Original Matrix:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		int[][]transpose=new int[row][col];
		System.out.println("Transposed Matrix:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				transpose[j][i]=matrix[i][j];
			}
	}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(transpose[i][j]+"\t");
			}
			System.out.println();
		}
}
}
