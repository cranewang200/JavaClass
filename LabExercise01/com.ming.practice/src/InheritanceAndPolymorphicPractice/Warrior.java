package InheritanceAndPolymorphicPractice;
/**
 * Warrior class inheritage Hero class
 *Assessment: CST8116 311 Exercise 1
 *Student Name: Ming Wang
 *Lab Professor Name: Stanley Pieda
 *Lab Section Number: 311
 *Due Date: Friday, Jan. 22
 */
public class Warrior extends Hero{


	private int pysicalAttack;
	
	public Warrior() {
		
	}

	public Warrior(String nickName, int pysicalAttack) {
		setNickName(nickName);
		setPysicalAttack(pysicalAttack);
	
	}
	
	@Override		//override comment
	public void move() {
		
		System.out.println("override Hero class move method");
		System.out.println(getNickName() + "移动基本靠腿zou");
	}
	
	
	@Override //重写equal 方法
	public boolean equals(Object obj) {
		//如果传入的OBJ 是Warrior类的实例
		if(!(obj instanceof Warrior))
			{
			return false;
			}
		Warrior newWarrior = (Warrior)obj;
		if(getNickName().equals(newWarrior.getNickName()) && getPysicalAttack() == newWarrior.getPysicalAttack() ) {
			return true;
		}
		return false;
	}
	
	@Override//重写toString 方法
	public String toString() {
		return getNickName() + "\t" + getLevel() + "\t" + getPysicalAttack();
	}
//	public void move() {
//		System.out.println("override Hero class move method");
//		System.out.println(getNickName() + "移动基本靠腿");
//	}
	
	public int getPysicalAttack() {
		return pysicalAttack;
	}

	public void setPysicalAttack(int pysicalAttack) {
		this.pysicalAttack = pysicalAttack;
	}
	
	

}
