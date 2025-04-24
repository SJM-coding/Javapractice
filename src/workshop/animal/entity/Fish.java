package workshop.animal.entity;

public class Fish extends Animal implements Pet {
	private String name;
	
	
	public Fish() {
		super(0);
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
			this.name = name;
	}

	@Override
	public void play() {
		System.out.println("물고기는 논다");
	}

	@Override
	public void eat() {
		System.out.println("물고기는 먹는다");

	}

}
