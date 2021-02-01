package com.ming.practice;
/**
 * human player
 *Assessment: CST8116 311 Exercise 1
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, Jan. 22
 */
public class HumanPlayer {
	public static final int MessageTypeFist = 1; // perform fist
	public static final int MessageTypeWin = 2;  //win words
	public static final int MessageTypeLose = 3; //lose words

	private String name;
	private int score;
	private int fist;
	
	private String[] fistWords = { //
			"hhhh",
			"hhhh",
			"大象大象你的鼻子为什么那么长",
			"必杀，露PP外星人",
			"ccc大姐姐你喜欢吃香蕉吗"
			
		};
	private String[] winWords = {
			"还有谁？",
			"猜拳，有点意思",
			"全军出击",
			"吃着火锅唱着歌，然后你就输了"
	};
	
	private String[] loseWords = {
			"通往成功的路上总在施工",
			"等到潮水褪去的时候，穷的连西北风都没得喝",
			"夏天就是不好，",
			"众人皆醉我独醒",
			"欧巴桑，吃我一拳"
	};
	/*
	 * 根据传入的消息类型，随机打印对应类型消息
	 * @para msyType 对应HumanPlayer类中定义的静态常量
	 */
	public void sendMessage(int msgType) {
		//生成一个0-4之间的随机数字
		int index = (int)(Math.random() * 1000 % 5);
		String message = null;
		switch (msgType) {
		case MessageTypeFist:
			message = fistWords[index];
			break;
		case MessageTypeWin:
			message = winWords[index];
			break;
		case MessageTypeLose:
			message = loseWords[index];
			break;
		}
		System.out.println(message);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getFist() {
		return fist;
	}

	public void setFist(int fist) {
		this.fist = fist;
	}
	
	
}
