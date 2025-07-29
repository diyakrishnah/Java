/*AUTHOR:DIYA KRISHNA
 * DATE;29/07/2025
 * PROGRAM :STATIC DEMO
 */
class Student {
	String Studentname;
	static int Studentcount=0;
	Student(String Studentname){
		this.Studentname=Studentname;
		Studentcount++;
	}
	public void printDetails() {
		System.out.println(Studentname);
		System.out.println(Studentcount);
	}
}
public class StaticDemo {
	public static void main(String[] args) {
		Student student1= new Student("Diya");
		student1.printDetails();
		Student student2= new Student("Krishna");
		student2.printDetails();
	}
}
