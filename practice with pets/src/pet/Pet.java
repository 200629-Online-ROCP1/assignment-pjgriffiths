package pet;

public class Pet {
	
	public String name;
	public static final int numLegs = 4;
	public String color;
	public int foodBite;
	
	
	public Pet() {}
	public Pet(String name, String color, int foodBite) {
		this.name = name;
		this.color = color;
		this.foodBite = foodBite;
		
	}
	public void call()
	{
		System.out.println(name + " has made a noise.");
	}
	
	public void eat(int foodBowl)
	{
		while(foodBowl > 0) {
			foodBowl -= foodBite;
			call();
		}
	}
}



