package workshop.animal.entity;

public abstract class Animal {
	
	protected int legs;
	
	protected Animal (int legs) {
		this.legs = legs;
	}
	
	public abstract void eat();
	
	public void walk() {
		System.out.println("동물은"+legs + "발로걷는다.");
	}
}
// 추상 클래스 안에는 추상메서드만