
public class SmurfRunner {
public static void main(String[] args) {
	
	Smurf handy = new Smurf ("Handy");
	handy.eat();
	System.out.print(handy.getName());
	
	Smurf papa = new Smurf ("Papa Smurf");
	System.out.print(papa.getName());
	System.out.print(papa.getHatColor());
	System.out.println(papa.isGirlOrBoy());
	
	Smurf smurfette = new Smurf ("Smurfette");
	System.out.print(smurfette.getName());
	System.out.print(smurfette.getHatColor());
	System.out.print(smurfette.isGirlOrBoy());
	}
}
