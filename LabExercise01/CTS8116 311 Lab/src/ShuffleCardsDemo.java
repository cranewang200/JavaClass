/**
 * 模拟实现洗牌的过程
 *Assessment: CST8116 311 Exercise 1
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, Jan. 22
 */
public class ShuffleCardsDemo {

	public static void main(String[] args) {
		final int N = 52;
		int[] cards = new int[N];
		for (int i = 0; i < cards.length; i++) {
			cards[i] = i; //牌面与循环变量的值一直， 新牌
		}

		System.out.println("xipaiqian");
		for (int i = 0; i < cards.length; i++) {
			System.out.print(cards[i]);
			if((i+1) % 13 ==0) {
				System.out.println();
			}else {
				System.out.print("\t");
			}
		}
		//洗牌原理，随机生成一个0-51之间的数字newIndex， nums[i] 和nums [newIndex]元素交换
		for (int i = 0; i < cards.length; i++) {
			int newIndex = (int)(Math.random() * N); //0-51之间的随机数字
		
			int temp = cards[i];
			cards[i] = cards[newIndex];
			cards[newIndex] = temp;
		}
		String[] cardsColors = {"黑桃","红心","梅花","方块"};
		String[] cardValues = {
				"A","1","2" ,"3" ,"4" ,"5" ,"6" ,"7" ,"8" ,"9" ,"10" ,"J" ,"Q" ,"K" 
		};
		System.out.println("xipaihou:" );
		for (int i = 0; i < cards.length; i++) {
			//System.out.print(cards[i]);
			System.out.printf("%s-%s", cardsColors[cards[i] / 13], cardValues[cards[i] % 13]);
			if((i+1) % 13 ==0) {
				System.out.println();
			}else {
				System.out.print("\t");
			}
		}
		
		
		

	}

}
