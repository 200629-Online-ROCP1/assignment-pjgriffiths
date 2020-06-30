package Driver;
import pet.Cat;


public class driver {

	public static void main(String args[]) {
		Cat oliver = new Cat("Oliver", "spotted", 15, 0);
	
		if(oliver.foodBowl <= 0) {
			oliver.foodBowl = 100;
			System.out.println("We have filled "+oliver.name+"'s foodBowl with "+oliver.foodBowl+ " food!");
		}
		oliver.eat(oliver.foodBowl);
		
	}
	
	
	
}
