
public class CatRunner {
public static void main(String[] args) {
	
	Cat luna = new Cat("Luna");
	//1. Get Cat to meow
	luna.meow();
	
	//2. Get Cat to Print name
	luna.printName();
	
	//3. Say bye! to the cat :)
	//For LOOP
	for(int i = 0; i < 10; i++) {
		luna.kill();
	}
	
	}
}
