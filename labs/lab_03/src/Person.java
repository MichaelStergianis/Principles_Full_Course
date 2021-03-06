
public class Person {
	   private String firstName;
	   private String lastName;
	   private int age;

	   public Person (String newFirstName, String newLastName, int newAge)
	   {
	      firstName = newFirstName;
	      lastName = newLastName;
	      age = newAge;
	   }
	   
	   public String getFirstName() 
	   {
	       return firstName;
	   }
	   
	   public String getLastName() 
	   {
	       return lastName;
	   }
	   
	   public int getAge() 
	   {
	       return age;
	   }
	   
	   //Override equals function here
		 public boolean equals(Person p1){
			 if (this.firstName == p1.getFirstName()
					 && this.lastName == p1.getLastName()
					 && this.age == p1.getAge()) return true;
			 else return false;
		 }
	   
}
