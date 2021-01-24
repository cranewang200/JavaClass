import java.util.Iterator;

/**
 * 黄金分割线 数列
 *Assessment: CST8116 311 Exercise 1
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, Jan. 22
 */
public class FibonacciDemo {

	public static void main(String[] args) {
		//0,1,1,2,3,5,8,13,21,34,55,89,144
		//规律，前两个元素的值固定。 第三个开始，是前两个元素之和
		int[] nums = new int[15];
		int sum = 0;
		double avg;
		nums[0] = 0;
		nums[1] = 1;
		for(int i = 2; i < nums.length; i++) {
			nums[i] = nums[i - 1] + nums[i - 2];
			
		}
		System.out.println("打印结果");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+ ",");
			sum += nums[i];
		}
		System.out.println(); //打印换行
		System.out.printf("总数为:"+sum);
		System.out.printf("平均数为:" + (sum / 1.0 / nums.length));
	}

}
