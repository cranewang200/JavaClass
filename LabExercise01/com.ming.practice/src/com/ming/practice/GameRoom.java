package com.ming.practice;

import java.util.Scanner;



/**
 * game room
 *Assessment: CST8116 311 Exercise 1
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, Jan. 22
 */
public class GameRoom {
	//attributes:  score boards, tools, players, room numbers, room name, room password
	//private String weapon;
	private HumanPlayer player1 = null;
	private ComPlayer player2 = null;
	private int roomId;
	private String roomName;
	private String roomPass;
	

	
	public GameRoom() {
		try {
			initGame();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		startGame();
		
		
	}
	//methods: start game(), initial game, display menu, choose players, judge the win or lose
	
	public void initGame() throws Exception {
		//1 instance player object
		//2 creat player name ( choiceRole)
		player1 = new HumanPlayer();
		player2 = new ComPlayer();
		
		//initial other attributes of game, 
		for (int i = 0; i < 50; i++) {
			System.out.print("*");
			Thread.sleep(50);
			
		}
		System.out.println();
		System.out.println("game loading completed");
		
	
		
	}
	
	public void startGame() {
		showMenu();
		choicRole();
		//fist
		while (true) {
		System.out.println(player1.getName() + "please fist");
		player1.setFist(new Scanner(System.in).nextInt());
		int fist1 = player1.getFist();
		player2.getFist();
		int fist2 = player2.getFist();
		//judge
		int result = judge(fist1, fist2); 
		// result = -1 player 1 win. result = 0 fair, result = 1 player2 win
		if (result == -1) {
			System.out.println("[Referee]:" + player1.getName() + "win!");
			player1.sendMessage(HumanPlayer.MessageTypeWin);
			player2.sendMessage(ComPlayer.MessageTypeLose);			
		}	else if (result == 0){
			System.out.println("[Referee]: Break Even, Again" );
			player1.sendMessage(HumanPlayer.MessageTypeFist);
			player2.sendMessage(ComPlayer.MessageTypeFist);
			
		}else {
			System.out.println("[Referee]:" + player2.getName() + "win!");
			player2.sendMessage(ComPlayer.MessageTypeWin);
			player1.sendMessage(HumanPlayer.MessageTypeLose);
			
		}
		System.out.println("play again? y / n");
		String input1 = new Scanner(System.in).next();
		if("y".equalsIgnoreCase(input1)){
			break;
		}
		
		}//printresult
		
	}
	
	public void showMenu() {
		System.out.println("welcome come (scissor，rock，paper) game" + roomName);
		System.out.println("rules: 1 = scissor, 2 = paper , 3= rock");
		
	}
	
	public void choicRole() {
		System.out.println("choice your enenmy:1- fengjian, 2- nini, 3-zhengnan, 4-adai");
		System.out.println("please choose:");
		int choice = new Scanner(System.in).nextInt();
		String[] nameArray = {"fengjian" ,"nini", "zhengnan", "adai"};
		//omit verify input
		player2.setName(nameArray[choice - 1]);
		player1.setName("蜡笔小新");
		System.out.println(player1.getName() +"  VS.  "+ player2.getName());
		
		
	}
	
	public int judge(int fist1,int fist2) {
		if (fist1 == fist2) return 0;
		if(fist1 == 1 && fist1 ==3 || fist1 == 2 && fist2 == 1 && fist1 == 3 && fist2 == 2 ) {
			player1.setScore(player1.getScore() + 1);
			player2.setScore(player2.getScore() - 1);
			return -1;
		}else {
			player1.setScore(player1.getScore() - 1);
			player2.setScore(player2.getScore() + 1);
			
			return 1;
		}
		
		
		
		
		
	}
	
	public void endGame() {
		System.out.println("game over, welcome play again");
		
	}
	
	
	public int getRoomId() {
		return roomId;
	}
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomPass() {
		return roomPass;
	}
	public void setRoomPass(String roomPass) {
		this.roomPass = roomPass;
	}
	
	
	
	
	
	
	
	
	
	

}
