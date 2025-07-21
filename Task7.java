/* AUTHOR:Diya krishna
 * DATE:21/07/2025
 * PROGRAM:Overloading
 */
class shape{
	public void area(float radius) {
		float area = 3.14f*radius*radius;
		System.out.println("Area of a circle is "+area);
	}
	public void area(int length ,int breadth) {
		int area = length*breadth;
		System.out.println("Area of a rectangle is "+area);
	}
	public void area(int side ) {
		int area = side*side;
		System.out.println("Area of a Square is "+area);
	}
}
public class Task7 {
	public static void main(String[] args) {
		shape Shape =new shape();
		Shape.area(5.2f);
		Shape.area(3,5);
		Shape.area(5);
	}
}	
