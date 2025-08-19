/* AUTHOR:diya krishna
 * DATE:19/08/2025
 * PROGRAM:Matrix
 */
import java.util.Vector;
public class vectrodemo {
	public static void main(String[] args) {
		Vector<String> mammals=new Vector<>();
		Vector<Integer> rollnumber=new Vector<>();
		rollnumber.add(1);
		rollnumber.add(2);
		System.out.println("Roll Number:"+rollnumber);
		rollnumber.remove(0);
		System.out.println("Roll number:"+rollnumber);
		rollnumber.get(2);
}
}