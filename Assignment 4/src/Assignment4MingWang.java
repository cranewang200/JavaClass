
public class Assignment4MingWang {

	public static void main(String[] args) {
		int[] values = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.print("Even numbers are: ");
		for(int index = 0; index < values.length - 1; index++) {
			    if(values[index] % 2 == 1){         
			        System.out.print(values[index] + " ");
			    }
		}
		System.out.println(); // newline after loop
		System.out.println("Program by Ming Wang");

	}

}
