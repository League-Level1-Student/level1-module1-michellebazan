package extra;
//create person
public class Person {
	private String name;
	private String superpower;
	//2 member variable- name & superpower
	public Person(String name, String superpower) {
		System.out.println(name + " is alive and has " + superpower + " as their power.");
	}
	// getter
	public String getName() {
		return name;
	}
	public String getSuperpower() {
		return superpower;
	}
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setSuperpower(String superpower) {
		this.superpower = superpower;
	}
	//Make a runner class now
}
