/**
 * demo math.random 
 *Assessment: CST8116 311 Exercise 1
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, Jan. 22
 */
public class MathRandomEemo {

	public static void main(String[] args) {
		int num = 88, num1 = 99;
		for (int i = 0; i < num1; i++) {
			//System.out.print(Math.random() * 88 +"|");
			System.out.print((int)(Math.random() * 10)+"/");
			if (i % 13 == 0) {
				System.out.println();
			} else {
				System.out.print(",");
			}
		}
	}

}
