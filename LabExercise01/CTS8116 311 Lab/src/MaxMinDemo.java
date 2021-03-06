/**
 * 求数组中的最大值和最小值
 *Assessment: CST8116 311 Exercise 1
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, Jan. 22
 */
public class MaxMinDemo {

	public static void main(String[] args) {
		//随机生成一个数组，球里面的最大值和最小值
		int nums[] = new int[20];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ((int)(Math.random() * 10000)) % 1001; //随机生成 0-1000之间的数字		
		}
		System.out.println("数组元素");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
		System.out.println();
		//求最大值和最小值
		//1. 假设第一个数字是最大值或者最小值
		//2. 拿最大值或者最小值逐个在数组中进行比较，如果某个元素比最大值还大，you can you up
		int max = nums[0];
		int min = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}			
		}
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max) { //如果数组中的某个元素比max 大 // you can you up
				max = nums[i];				
			}
		}
		System.out.println("数组中的最大值是" + max);
		System.out.println("数组中的最小值是" + min);
	}

}
