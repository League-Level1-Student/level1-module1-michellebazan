
public class SeaCreatureRunner {
 public static void main(String[] args) {
	 
	 SeaCreature spongebob = new SeaCreature ("SpongeBob");
	//1. make him eat and laugh 
	spongebob.eat();
	//spongebob.laugh();
	
	//2. Patrick and Squidward - eat and laugh
	SeaCreature patrick = new SeaCreature ("Patrick");
	SeaCreature squid = new SeaCreature ("Squidward");
	
	System.out.println(patrick.getName());
	patrick.eat();
	//patrick.laugh();
	
	System.out.println(squid.getName());
	squid.eat();
	//squid.laugh();
 }
}
