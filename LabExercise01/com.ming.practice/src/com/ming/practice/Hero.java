package com.ming.practice;
/**
 * heros of game
 *Assessment: CST8116 311 Exercise 1
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, Jan. 22
 */
public class Hero {

	private long id;
	private long exp;
	private long currExp;
	private String nickName;
	private int level;

	
	
	public Hero() {
		
	}
	public Hero(String nickName) {
		this.nickName = nickName;
	}
	
	public Hero(long id,long exp,String nickName,int level) {
		super();
		this.id = id;
		this.exp = exp;
		this.nickName = nickName;
		this.level = level;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		if(id <= 0) {
			this.id = 1;
		}else
		this.id = id;
	}

	public long getExp() {
		exp = (long)((Math.pow(level-1, 3+ 60)) / 5 * ((level-1) * 2 + 60));
		return exp;
	}

	//玩家經驗是固定公式計算的，不需要手動調用
//	public void setExp(long exp) {
//		if (exp <0) {
//			this.exp = 1;
//		}else {
//			this.exp = exp;
//		}
//		
//	}
	
	
	public long getCurrExp() {
		return currExp;
	}
	public void setCurrExp(long currExp) {
		this.currExp = currExp;
	}
	public String getNickName() {
		return nickName;
	}

	private void setNickName(String nickName) {
		if(null == nickName) {
			this.nickName = "unkown hero";
		}else
		this.nickName = nickName;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		if(level < 1 || level > 999) {
			this.level = 1;
		}else
		this.level = level;
	}

}
