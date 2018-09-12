
public class BackpackRunner {
public static void main(String[] args) {
	//create object of class, then use it
	Backpack bp = new Backpack();
	Pencil pencil = new Pencil();
	Ruler rule = new Ruler();
	Textbook book = new Textbook();
	
	bp.putInBackpack(pencil);
	bp.putInBackpack(rule);
	bp.putInBackpack(book);
	bp.goToSchool();
	
	}
}
