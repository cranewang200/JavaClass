/**
 * 定义一个数组，求奇数个数和偶数个数
 *
 *Assessment: CST8116 311 Exercise 1
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, Jan. 22
 */
public class NumsCount {

	public static void main(String[] args) {
		int[] nums = new int[20];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ((int)(Math.random() * 10000)) % 1001; //0-1000随机数
					
		}
		System.out.print("元素数组");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
		System.out.println();
		
		int count1 = 0, count2 = 0; 
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 ==0) { 
					count2++;
					System.out.print("第"+ count2 +"偶数数字为" + nums[i] + ",");
		}else
		
		{
			count1++;
			System.out.print("第"+ count1 +"奇数数字为" + nums[i] + ",");
		}
	}
		System.out.println("偶数的个数为：" + count2);
		System.out.println("奇数的个数为：" + count1);
}
}