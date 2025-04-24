package workshop.animal.entity;
import workshop.animal.entity.Cat;
import workshop.animal.entity.Pet;
public class AnimalTest {

	public static void main(String[] args) {
		
		
		Cat cat1 = new Cat();
		Pet cat2 = new Cat();
		Animal cat3 = new Cat();
		// Pet으로부터 상속받은 메서드 
		cat1.setName("톰");
		System.out.println(cat1.getName());
		cat1.play();
		
		//Animal로부터 상속받은 메서드 
		cat1.eat();
		cat1.walk();
		
		//Pet으로부터 상속 받은 메서드 
		cat2.setName("미야옹");
		System.out.println(cat2.getName());
		cat2.play();
		
		//Animal로부터 상속받은 메서드 
		cat3.eat();
		cat3.walk();
	}
}
