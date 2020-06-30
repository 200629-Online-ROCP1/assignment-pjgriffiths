package pet;

public class Cat extends Pet{
	
	
	public int foodBowl;
	
	public Cat(String name, String color, int foodBite, int foodBowl) {
	
		super(name, color, foodBite);
		this.foodBowl = foodBowl;
	}
	
	public void call() {
		System.out.println("Meow!");
	}
}
