

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
		RaceCar ford = new RaceCar("Ford", 5);
		ford.getPositionInRace();
		
		// 2. Print out position in Race
		System.out.println("Your car is in " + ford.getPositionInRace() + "th place!");
		
		// 3. Crash the RaceCar
		ford.crash();
		
		// 4. If the car is damaged. Bring it in for a pit stop.
		if (ford.isDamaged()){
			ford.pit();
			System.out.println("Your car is in " + ford.getPositionInRace()+ "th place! ");
		}
		
		// 5. Get to first place
		//REGULAR LOOP
		//for(int i = 0; i <10; i++) {
		//	ford.overtake();
		//}
		
		
		/// WHILE LOOP
		while(ford.getPositionInRace() > 1) {
			ford.overtake();
		System.out.println("Your car is in " +ford.getPositionInRace() +"th place!");
		}
		
		
	}
}
