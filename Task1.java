/*AUTHOR: DIYA KRISHNA
 * DATE:11/7/2025
 */
public class Task1 {
	public static  void main(String[] arg) {
		String grade="A+";
		String result = switch (grade) {
		case"O"->"Outstanding performance";
		case"A+"->"Excellent performance";
		case"A"->"very good performance";
		case"B+"->"Good performance";
		case"B"->"Above average performance";
		case"C+"->"Average performance";
		case"C"->"Below Average performance";
		case"D+"->"pass";
		case"D"->"Fail.";
		default->"Invalid grade";
		};
	System.out.println("Grade:"+ grade);
	System.out.println("Result:"+result);
	}

}
