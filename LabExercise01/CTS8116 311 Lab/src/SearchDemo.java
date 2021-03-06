import java.util.Scanner;

/**
 * 重点， 查找输入的数字的下表， 没有找到则为-1
 *Assessment: CST8116 311 Exercise 1
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, Jan. 22
 */
public class SearchDemo {

	public static void main(String[] args) {
		int[] nums = new int[10];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = ((int)(Math.random() * 10000)) % 1001;
			
		}
		System.out.println("数组元素");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
		System.out.println();
		//让用户输入需要查找的数字
	//进行循环、遍历数组查找对应的元素，如果找到了打印下表，没找到打印-1
		System.out.println("请输入需要查找的数字：");
		int searchNum = new Scanner(System.in).nextInt();
		int searchIndex = -1; //套路，一般要找的下标初值为-1
		//循环查找
		for (int i = 0; i < nums.length; i++) {
			if(searchNum == nums[i]) {
				searchIndex = i; //找到后记录下要查找元素的下标
				break;
			}
			Math.pow(a, b);
			
		}
		//再循环后进行判断
		if(searchIndex == -1) {
			System.out.println("很遗憾，没有招待这个元素");
		}else {
			System.out.println("恭喜，已找到元素，元素的下标为" + searchIndex);
		}
	}

}
