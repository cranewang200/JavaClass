package InheritanceAndPolymorphicPractice;
/**
 * Hero class , parent class
 *Assessment: CST8116 311 Exercise 1
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, Jan. 22
 */
public class Hero {
	private String nickName;
	private int level;
	private int maxLife;
	private int currLife;
	
	
	public Hero() {
		super();
		
	}


	public Hero(String nickName, int level, int maxLife, int currLife) {
		super();
		this.nickName = nickName;
		this.level = level;
		this.maxLife = maxLife;
		this.currLife = currLife;
	}

	public void move() {
		System.out.println("Hero class move method");
	}

	public String getNickName() {
		return nickName;
	}


	public void setNickName(String nickName) {
		this.nickName = nickName;
	}


	public int getLevel() {
		return level;
	}


	public void setLevel(int level) {
		this.level = level;
	}


	public int getMaxLife() {
		return maxLife;
	}


	public void setMaxLife(int maxLife) {
		this.maxLife = maxLife;
	}


	public int getCurrLife() {
		return currLife;
	}


	public void setCurrLife(int currLife) {
		this.currLife = currLife;
	}
	
	

}
