package InheritanceAndPolymorphicPractice;

public class HeroTest {

	public static void main(String[] args) {


		Warrior war1 = new Warrior("韩信", 500);
		System.out.println(war1.getNickName()+ war1.getPysicalAttack());
		war1.move();
		
		Hero war2 = new Warrior("曹操", 1500);  //子类实现了父类
		war2.move();
		
		war1.getPysicalAttack(); //子类对象
		war2.getNickName();		//父类对象

	}

}
