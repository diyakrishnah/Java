/*AUTHOR:DIYA KRISHNA
 * DATE:18/7/2025
 */
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
		Student student1 =new Student("Diya krishna",33,"CSE");
		student1.Studentinfo();
	}
}

