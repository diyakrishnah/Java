/* AUTHOR:Diya krishna
 * DATE:21/07/2025
 * PROGRAM:Overloading
 */
class calculator{
	public void add(int num1,int num2) {
		int add = num1+num2;
		System.out.println("Addition of two numbers are :"+add);
	}
	public void add(int num1,int num2,int num3) {
		int add = num1+num2+num3;
		System.out.println("Addition of three numbers are :"+add);
	}
	public void add(double num1,double num2) {
		double add = num1+num2;
		System.out.println("Addition of two  double numbers are :"+add);
	}
	public void add(String a,int num2) {
		String add = a+num2;
		System.out.println("Addition of string and a numbers are :"+add);
	}
}
public class Task6 {
	public static void main(String[] args) {
		calculator calculation = new calculator();
		calculation.add(5, 6);
		calculation.add(5, 6, 7);
		calculation.add(3.12,4.21);
		calculation.add("number is ", 6);
	}
}
