import java.util.Iterator;
import java.util.Scanner;

/*
 *Assessment: CST8116 311 Exercise 1
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, Jan. 22
 */
public class PracticeInClass {

	public static void main(String[] args) {
		//要求学生动态录入5个学生成绩，求平均成绩
		Scanner input = new Scanner(System.in);
		double [] scores = new double[6];
		double sum = 0 , avg;
		for(int i = 0; i < scores.length; i++) {
			System.out.println("请输入第"+(i+1) + "位同学的成绩：");
			scores[i] = input.nextDouble();
		}
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
			
		}
		System.out.printf("%d位同学的平均成绩为：%.2f", scores.length, sum / scores.length);
	}

}
