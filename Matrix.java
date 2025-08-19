/* AUTHOR:diya krishna
 * DATE:19/08/2025
 * PROGRAM:Matrix
 */

import java.util.Scanner;
public class Matrix {
	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		int[][] matrix = {
				{1,2,3,0},
				{2,3,4,5},
				{3,4,0,0}
		};
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
