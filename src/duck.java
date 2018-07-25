

public class duck {

 int numberOfFriends = 0;
 String favoriteFood = "";
 String name = ""; 
 
 
 public void quack() {
	 System.out.println(this.name + " says quack");
 }
 public void waddle() {
	 System.out.println(this.name + " waddles");
 }
 
 public duck (int numberOfFriends, String favoriteFood, String name){
	 this.numberOfFriends = numberOfFriends;
	 this.favoriteFood = favoriteFood;
	 this.name = name;
	 
	 
	 System.out.println(this.name + " was created");
	 
 }
 
}
