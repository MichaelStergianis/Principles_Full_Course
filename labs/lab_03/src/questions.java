import java.util.Scanner;


public class questions {
	void q1()
	{
		String[] matString;
		int[][] mat = new int[3][3];
		matString = qOneInt();
		if (matString.length != 9){
			System.out.println("You did not enter a valid string, please try again");
			matString = qOneInt();
		}
		for ( int i = 0; i < 3; ++i){
			for (int j = 0; j < 3; ++j){
				mat[i][j] = Integer.parseInt(matString[(i*3)+j]);
			}
		}
		for (int i = 0; i < 3; ++i){
			for (int j = 0; j < 3; ++j){
				System.out.print(mat[i][j] + "\t");
			}
			if (i == 1 || i == 0) System.out.print("\n\n");
			else System.out.print("\n");
		}
		mat = transpose(mat);
		for (int i = 0; i < 3; ++i){
			for (int j = 0; j < 3; ++j){
				System.out.print(mat[i][j] + "\t");
			}
			if (i == 1 || i == 0) System.out.print("\n\n");
			else System.out.print("\n");
		}
	}

	String[] qOneInt(){
		String intIn;
		String[] matString;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter 9 consecutive integers separated by spaces.");
		System.out.print("> ");
		intIn = s.nextLine();
		matString = intIn.split(" ");
		if (matString.length != 9){
			System.out.println("You did not enter a vaid string, please try again");
			return qOneInt();
		} else{
			return matString;
		}
	}
	int[][] transpose(int[][] m1){
		int[][] swap = new int[3][3];
		for (int i = 0; i < 3; ++i){
			for (int j = 0; j < 3; ++j){
				swap[j][i] = m1[i][j];
			}
		}
		m1 = swap;
		swap = null;
		return m1;
	}
	
	void q2()
	{
		
		Person p1 = new Person("Tim", "Hortons", 23);
		Person p2 = new Person("Jean", "Hortons", 24);
		Person p3 = new Person("Tim", "Hortons", 23);
		
		System.out.println(p1.equals(p1));
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));		
		
	}
	
	void q3()
	{
		//Dog dog = new Dog("Spike");
		Dog L_dog = new Labrador("Tim", "Yellow");
		Dog Y_dog = new Yorkshire("Joe");
		System.out.println(L_dog.getName() + " says " + L_dog.speak() + ", weight is: " + L_dog.avgBreedWeight());
		System.out.println(Y_dog.getName() + " says " + Y_dog.speak() + ", weight is: " + Y_dog.avgBreedWeight());
	}
	
	void q4()
	{
		//uncomment the following code block, complete it to finish its function
		Dog myDog; // Give a correct class to define myDog 
		String ans = "y";
		int choice;
		Scanner scan = new Scanner(System.in);
		while(ans.equalsIgnoreCase("y"))
		{
			System.out.println("Choose a Breed:\n1. Labrador\n2. Yorkshire");
			choice = scan.nextInt();
			
			if(choice == 1)
			{
				System.out.println("I am Labrador, give me a name and color: ");
				String name = scan.nextLine();
				String color = scan.next();
				myDog = new Labrador(name, color); // Select a correct dog class to make a instance 
			}
			else
			{
				System.out.println("I am Yorshire, give me a name: ");
				String name = scan.nextLine();
				myDog =	new Yorkshire(name); // Select a correct dog class to make a instance 
			}
		}
	}
	
	void q5()
	{
		Scanner s = new Scanner(System.in);
		Shape[] sh = new Shape[2];
		double templ, tempw;
		while (true){
			System.out.print("Please choose the side length for your square: ");
			try{
				sh[0] = new Square(s.nextDouble());
			}catch (Exception e){
				System.out.println(e);
				continue;
			}
			break;
		}
		while(true){
			System.out.print("Please choose the length for your rectangle: ");
			templ = s.nextDouble();
			System.out.print("Please choose the width for your rectangle: ");
			tempw = s.nextDouble();
			try{
				sh[1] = new Rectangle(templ, tempw);
			}catch (Exception e){
				System.out.println(e);
				continue;
			}
			break;
		}
		for(int i = 0; i < 2; ++i){
			System.out.println(sh[i].getName() + "'s area is " + sh[i].getArea());
		}

	}
}
