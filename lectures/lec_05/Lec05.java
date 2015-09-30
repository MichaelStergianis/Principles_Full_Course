/*
1. Create a class Person, which stores the name the person.
2. toString() method of this class prints the name of the person.

3. Create a class Child, which is a subclass of Person and that also stores the name of the parent. 
4. toString() method of this class prints the name of the person and his or her parent.

5. Create a class Player, which is a subclass of Child.  It also stores the favorite sport of this player.
6. toString() method prints the name, parent's name, and the favorite sport of this player.

7. Now create an array and use it to store 1 person, 1 child, and 1 player instance.  
8. Loop over the array entries and print them?
*/
class Person
{
	protected String name;
	public Person(String name){
		this.name = name;
	}

	public String toString(){
		return name;
	}
}
class Child extends Person
{
	protected String parent_name;
	public Child(String name, String parent_name){
		super(name);
		this.parent_name = parent_name;
	}
	public String toString(){
		return (name + ", " + parent_name);
	}
}
class Player extends Child{
	protected String fav_sport;

	public Player(String name, String parent_name, String fav_sport){
		super(name, parent_name);
		this.fav_sport = fav_sport;
	}
	public String toString(){
		return (name + ", " + parent_name + ", " + fav_sport);
	}
}
class Lec05 
{
	public static void main(String[] args) {
		System.out.println("Lec 05 - in class exercise");
		
		Person adam = new Person("Adam");
		System.out.println(adam);
		
		Child jacob = new Child("Jacob", "Adam");
		System.out.println(jacob);
		
		Player bruce = new Player("Bruce", "Boris", "Soccer");
		System.out.println(bruce);              
		
		Person[] arr = new Person[3];
		arr[0] = adam;
		arr[1] = jacob;
		arr[2] = bruce;
		for (int i = 0; i < arr.length; ++i){
			System.out.println(arr[i]);
		}
    }
}
