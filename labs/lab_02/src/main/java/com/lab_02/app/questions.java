import java.util.Scanner;
import java.util.Random;

public class questions {
	
	//This is an example
	void q0()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an option from 0 to 5.\n> ");
		int option = scan.nextInt();
		if (option == 0){
			System.out.println("Hello World!");
		} else if (option == 1){
			System.out.println("You input: " + option);
			q1();
		} else if (option == 2){
			System.out.println("You input: " + option);
			q2();
		} else if (option == 3){
			System.out.println("You input: " + option);
			q3();
		} else if (option == 4){
			System.out.println("You input: " + option);
			q4();
		} else if (option == 5){
			System.out.println("You input: " + option);
			q5();
		} else{
			System.out.println("You did not input a valid option");
		}
		scan = null;
	}
	
	void q1()
	{
		int val1, val2, val3;
		double average;
		Scanner scan = new Scanner(System.in) ;

       // get three values from user
		System.out.print("Input for value 1: ");
		val1 = scan.nextInt();
		System.out.print("Input for value 1: ");
		val2 = scan.nextInt();
		System.out.print("Input for value 1: ");
		val3 = scan.nextInt();
       //Calculate average here
		average = (val1 + val2 + val3) / 3.0;
       //Print it out here
		System.out.println("The average is " + average);
		scan = null;
	}
	
	void q2()
	{
		for (int i = 0; i < 19; ++i){
			System.out.print("/");
		}
		for (int i = 0; i < 19; ++i){
			System.out.print("\\");
		}
		System.out.print("\n");
		System.out.println("==          Student Points          ==");
		for (int i = 0; i < 19; ++i){
			System.out.print("\\");
		}
		for (int i = 0; i < 19; ++i){
			System.out.print("/");
		}
		System.out.print("\n");
		// String array used for formatted output
		final String arr[] = {
			"Name", "Lab", "Bonus", "Total",
			"----", "---", "-----", "-----",
		 	"Joe", "43", "7", "50",
			"William", "50", "8", "58",
			"Mary Sue", "39", "10", "49"
		};
		// Formatted output below
		// %1$ corresponds to arg 1 of that printf call
		// - corresponds to left justification
		// ** numbers correspond to amount of width given to that portion
		System.out.printf("%1$-10s%2$-8s%3$-8s%4$-6s\n",
			 	arr[0], arr[1], arr[2], arr[3]);
		System.out.printf("%1$-10s%2$-8s%3$-8s%4$-6s\n", 
			 	arr[4], arr[5], arr[6], arr[7]);
		System.out.printf("%1$-10s%2$-8s%3$-8s%4$-6s\n",
			 	arr[8], arr[9], arr[10], arr[11]);
		System.out.printf("%1$-10s%2$-8s%3$-8s%4$-6s\n",
			 	arr[12], arr[13], arr[14], arr[15]);
		System.out.printf("%1$-10s%2$-8s%3$-8s%4$-6s\n",
			 	arr[16], arr[17], arr[18], arr[19]);
	}
	
	void q3()
	{
		int arr[] = new int[5];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 5; ++i){
			arr[i] = scan.nextInt();
			if (arr[i] < 10 || arr[i] > 100){
				System.out.println("The number must be in range of 10 to 100");
				arr[i] = 0;
			}
			for (int j = 0; j < i; j++){
				if (arr[j] == arr[i] && arr[j] != 0){
					System.out.println("Duplicate input: " + arr[i] + " I already have "
							+ arr[i]);
					arr[i] = 0;
				}
			}
		}
		int count = 0;
		for (int i = 0; i < 5; ++i) if (arr[i] != 0) count++;
		int arr2[] = new int[count];
		int jc = 0;
		for (int i = 0; i < 5; ++i){
			if (arr[i] != 0){
				arr2[jc] = arr[i];
				++jc;
			}
		}
		arr = null;
		System.gc();
		System.out.println("All correct input");
		for (int i = 0; i < count; ++i) System.out.println(arr2[i]);


	}
	
	void q4()
	{
	    String college = new String ("PoDunk College");		
	    // part (a)
			String town = new String ("Anytown, USA");
		
	    int stringLength;
	    String change1, change2, change3; 	    
	    // part (b)
			stringLength = college.length();
	    
	    System.out.println (college + " contains " + stringLength + " characters.");
			change1 = college.toUpperCase();
			change2 = change1.replace('O', '*');
	    change3 = college.concat(town);
	    System.out.println ("The second string is " + change2);
	    System.out.println ("The final string is " + change3);
	}
	
	void q5()
	{
		System.out.println("Please enter R(ock), S(cissor) or P(aper)");		
		Scanner scan = new Scanner(System.in);		
		
		String personPlay;
		
		String computerPlay;
		int computerInt; //Randomly generate number used to determine computer's play
		
		//Get player's play -- note that this is stored as a string
		while ( !(personPlay.equalsIgnoreCase("r")
					&& personPlay.equalsIgnoreCase("p") 
					&& personPlay.equalsIgnoreCase("s"))
		personPlay = scan.next();
		
		//Make player's play uppercase for ease of comparison
		personPlay.toUpperCase();
		//Generate computer's play (0,1,2)
		Random ran = new Random();
		computerInt = (ran.nextInt() % 3);
		//Translate computer's randomly generated play to string
		switch (computerInt){
				case 0:
					computerPlay = "R";
				case 1:
					computerPlay = "P";
				case 2:
					computerPlay = "S";

		}
		// Figure out who won
		
	}
}
