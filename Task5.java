/*AUTHOR:DIYA KRISHNA
 * DATE:18/7/2025
 */
import java.util.Scanner;
class Student{//class
	String Name;
	int Rollnumber;
	String Department;
	Student(String Name,int Rollnumber,String Department){
		//parameterized constructor
		this.Name=Name;
		this.Rollnumber=Rollnumber;
		this.Department=Department;
	}
	public void Studentinfo() {
		System.out.println("Name:\t\t"+Name);
		System.out.println("Roll number:\t"+Rollnumber);
		System.out.println("Department:\t"+Department);
	}
}
public class Task5 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String Name,Department;
		int Rollnumber;
		Name =scr.nextLine();
		Rollnumber =scr.nextInt();
		scr.nextLine();
		Department =scr.nextLine();
		Student student1 =new Student(Name,Rollnumber,Department);
		student1.Studentinfo();
		scr.close();
	}
}

