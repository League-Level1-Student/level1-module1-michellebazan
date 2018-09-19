package extra;

public class PersonRunner {
	public static void main(String[] args) {
	
		Person peep = new Person();
		peep.setName("Carter");
		peep.setSuperpower("Time Travel");
		Person meep = new Person();
		meep.setName("Tony");
		meep.setSuperpower("Super speed");
		Person people = new Person();
		people.setName("Carly");
		people.setSuperpower("Gravity");
		
		
		System.out.println(peep);
		System.out.println(meep);
		System.out.println(people);
		
		
	}
}
