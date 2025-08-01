/*AUTHOR:DIYAKRISHNA
 * DATE:1/08/2025
 */
class Student{
	String name;
	int rollNumber; 
	static int Studentcount=0;
	Student(String name,int rollNumber){
		this.name=name;
		this.rollNumber=rollNumber;
		Studentcount++;
	}
	public static void studentcount() {
		
		System.out.println("Student count:"+Studentcount);
	}
}

public class Task8 {
	public static void main(String[] args) {
		Student student1=new Student("Diya",33);
		Student student2=new Student("lakshmy",51);
		Student student3=new Student("siva",66);
		Student.studentcount();
}
}
