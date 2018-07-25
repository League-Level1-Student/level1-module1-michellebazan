
public class duckRunner {
public static void main(String[] args) {
	
	duck Rob = new duck(0, "egg", "Rob");
	Rob.waddle();
	Rob.quack();
	
	
	duck Chicken = new duck(2, "ice", "Chicken");
	Chicken.waddle();
	Chicken.quack();
	
	
	duck Obi = new duck(4, "orbs", "Obi");
	Obi.waddle();
	
	Rob.numberOfFriends = 7;
	System.out.println(Rob.numberOfFriends);
	System.out.println(Chicken.numberOfFriends);
/// ducks + individuality
	
	
}
}
