/**
 * time clock 
 *Assessment: CST8116 311 Exercise 1
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, Jan. 22
 */
public class Display {

	private int value = 0;
	private int limit = 0;
	
	public Display (int limit) {
		this.limit = limit;
	}
	
	public void increase() {
		value++;
		if (value == limit) {
			value = 0;
			
		}
	}
		public int getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		Display d = new Display(24);
		for (; ; ) {
			d.increase();
			System.out.println(d.getValue());
		}

	}

}
